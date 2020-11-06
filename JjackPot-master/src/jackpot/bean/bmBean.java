package jackpot.bean;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import jackpot.DTO.bmDTO;
import jackpot.DTO.empDTO;
import jackpot.DTO.memoDTO;
import jackpot.DTO.orgDTO;



@Controller

public class bmBean {
	
	@Autowired
	private SqlMapClientTemplate sqlMap;   
	
	/*����������Ʈ����*/
	@RequestMapping("/bmList.jp")
	public String bmList( String pageNum,HttpSession session, bmDTO bmdto, Model model, HttpServletRequest request){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		List bmList = null;
		bmList = sqlMap.queryForList("bm.getBmList", bmdto);
		int bmcount = (int) sqlMap.queryForObject("bm.bmcount", bmdto);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.
	

		if(pageNum == null) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount = bmcount / pageSize + ( bmcount % pageSize == 0 ? 0 : 1);
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}
		

		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bmList", bmList);
		model.addAttribute("bmcount", bmcount);		
	
		
		return "/bm/bmList";

	}
	
	/*���� */
	@RequestMapping("bm_delete1.jp")
	public String bm_delete1(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			
			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		
		return "/bm/bm_delete1";
	}
	
/*-----------------------------todo-------------------------------------------------------------*/		
	
	/*���� ����*/
@RequestMapping("/mytodoList.jp")
	public String mytodoList(bmDTO bmdto, HttpSession session, Model model,String pageNum){

		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		List mytodoList = null;
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		int count = (int) sqlMap.queryForObject("bm.getMytodoListcount", bm_name);
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    mytodoList = sqlMap.queryForList("bm.getMytodoList", params);


		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("mytodoList", mytodoList);
		model.addAttribute("count", count);			
		model.addAttribute("number", number);
		return "/bm/mytodo/mytodoList";
		
	}	
	
	/*���� ���� ���� ����*/
@RequestMapping("/mytodoContent.jp")
	public String mytodoContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);

		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBusinessCont", bm_num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);
	
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	
		
		return "/bm/mytodo/mytodoContent";
		
	}

	/*���� ���� ����  */
@RequestMapping("/mytodoContentModify.jp")
public String mytodoContentModify(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session){
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
	bmdto = (bmDTO)sqlMap.queryForObject("bm.getEmp_name2", emp_num);	
	bmdto = (bmDTO) sqlMap.queryForObject("bm.getBusinessCont", bm_num);
	int countBns_box = (int) sqlMap.queryForObject("bm.countBns_box",bmdto);
	List ListBns_box = sqlMap.queryForList("bm.ListBns_box", null);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	/*  ���� �ҷ����� */
	List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
	int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);

	model.addAttribute("bmdto", bmdto);
	model.addAttribute("emp_num", emp_num);
	model.addAttribute("bm_num", bm_num);
	model.addAttribute("bmdto", bmdto);
	model.addAttribute("sdf", sdf);		
	model.addAttribute("Bm_file", Bm_file);		
	model.addAttribute("fileCount", fileCount);	
	model.addAttribute("countBns_box", countBns_box);
	model.addAttribute("ListBns_box", ListBns_box);
	model.addAttribute("bm_name",bm_name);
	
	return "/bm/mytodo/mytodoContentModify";
	
}


/*���� �������� myBmFormModifyPro*/
@RequestMapping("/mytodoContentModifyPro.jp")
public String mytodoContentModifyPro(Model model,HttpSession session, MultipartHttpServletRequest request){
	System.out.println("1");
	bmDTO bmdto = new bmDTO();
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	System.out.println(bm_num);
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	bmdto.setBm_title(request.getParameter("bm_title"));
	bmdto.setBm_content(request.getParameter("bm_content"));
	bmdto.setReg_notice(request.getParameter("reg_notice"));
	bmdto.setCmp_notice(request.getParameter("cmp_notice"));
	bmdto.setBns_box(Integer.parseInt(request.getParameter("bns_box")));
	System.out.println("2");
	/*���� �� ��¥ */
	bmdto.setBm_start(request.getParameter("bm_start"));
	bmdto.setBm_end(request.getParameter("bm_end"));
	sqlMap.update("bm.bmUpdate", bm_num);
	
	String path = request.getRealPath("save"); // ���� ���
	System.out.println("3");
	String [] cfile = request.getParameterValues("cfile");
	if(cfile != null) {
		for(int i=0; i<cfile.length; i++) {
			bmdto.setOrg_file(cfile[i]);
			System.out.println("���� : "+bmdto.getOrg_file());
			
			bmdto = (bmDTO)sqlMap.queryForObject("bm.Bm_file", bmdto);
			
			/* ������ ����� ������ ���� */
			try {
				File fileF = new File(path+"\\"+bmdto.getSys_file());
				
				if(fileF.exists()) {
					fileF.delete();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("4");
		sqlMap.delete("bm.delBm_file", bmdto);
		}
	}
	
	/*�������� ���*/
	System.out.println("5");
	List<MultipartFile> fileMf = request.getFiles("org_file");
	for(MultipartFile multiFile : fileMf) {
		String fileName = multiFile.getOriginalFilename();
		System.out.println(fileName);
		if(fileName != "") {
			//bmdto.setOrg_file(fileName);
			int extFile = fileName.lastIndexOf(".");
			fileName = fileName.substring(extFile+1);
			String fmFile ="_"+bmdto.getBm_num()+"."+fileName;
		
			fmFile = fmFile.replace(" ", "");
			fmFile = fmFile.replace(":", "");
			File ff = new File(path+"//"+fmFile);
	
			try {
				multiFile.transferTo(ff);
			} catch(Exception e) {
				e.printStackTrace();
			}//������ ���� ����
			bmdto.setSys_file(fmFile);
			System.out.println("6");
			//sqlMap.insert("bm.inserBm_file", bmdto);
		}
		System.out.println("7");
	}


/*		���������� ���
	bmdto.setBm_num(bmNum);
	sqlMap.insert("bm.insertBns_box", bmdto);*/

	System.out.println("8");
	return "/bm/mytodo/mytodoContentModifyPro";

}

	/*�������� ���� */
	@RequestMapping("my_bm_delete.jp")
	public String my_bm_delete(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			
			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		return "/bm/mytodo/my_bm_delete";
	}
	
/*-------------------------------------������û-----------------------------------------*/	
	/*���� �� ������û����Ʈ����*/
	@RequestMapping("/myBmYCHList.jp")
	public String myBmYCHList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List MyBmYchList = null;
		int count = (int) sqlMap.queryForObject("bm.getBmYchListcount", bm_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    MyBmYchList = sqlMap.queryForList("bm.getMyBmYchList", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("MyBmYchList", MyBmYchList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/myBmYCHList";
		
	}
	
	
	
	/*���� ������û ���� ����*/
	@RequestMapping("/myBmYCHContent.jp")
	public String myBmYCHcontent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		bmDTO his = new bmDTO();
		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmYchcont", bm_num);
		his = (bmDTO) sqlMap.queryForObject("bm.gethistory", bm_num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file2", bm_num);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount2", bm_num);

		model.addAttribute("his", his);
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	

		
		
		
		return "/bm/BmYCHList/myBmYCHContent";
		
	}
	
/*���� �������� ����  */
@RequestMapping("/myBmContentModify.jp")
public String myBmContentModify(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session){
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
	bmdto = (bmDTO)sqlMap.queryForObject("bm.getEmp_name2", emp_num);	
	bmdto = (bmDTO) sqlMap.queryForObject("bm.getBusinessCont", bm_num);
	int countBns_box = (int) sqlMap.queryForObject("bm.countBns_box",bmdto);
	List ListBns_box = sqlMap.queryForList("bm.ListBns_box", null);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	/*  ���� �ҷ����� */
	List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
	int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);

	model.addAttribute("bmdto", bmdto);
	model.addAttribute("emp_num", emp_num);
	model.addAttribute("bm_num", bm_num);
	model.addAttribute("bmdto", bmdto);
	model.addAttribute("sdf", sdf);		
	model.addAttribute("Bm_file", Bm_file);		
	model.addAttribute("fileCount", fileCount);	
	model.addAttribute("countBns_box", countBns_box);
	model.addAttribute("ListBns_box", ListBns_box);
	model.addAttribute("bm_name",bm_name);
	
	return "/bm/BmBGList/myBmContentModify";
	
}

/*���� �������� myBmFormModifyPro*/
@RequestMapping("/myBmContentModifyPro.jp")
public String myBmContentModifyPro(Model model,HttpSession session, MultipartHttpServletRequest request){
	bmDTO bmdto = new bmDTO();
	System.out.println("1");
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	System.out.println(bm_num);
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	bmdto.setBm_title(request.getParameter("bm_title"));
	bmdto.setBm_content(request.getParameter("bm_content"));
	bmdto.setReg_notice(request.getParameter("reg_notice"));
	bmdto.setCmp_notice(request.getParameter("cmp_notice"));
	bmdto.setBns_box(Integer.parseInt(request.getParameter("bns_box")));
	System.out.println("2");
	
	sqlMap.update("bm.bgbmUpdate", bm_num);
	/*������*/
	bmdto.setBm_num(bm_num);
	String ref_name[] = request.getParameterValues("ref_name");
	
	if(ref_name.length > 0){
		for(String s : ref_name){
			System.out.println("--->"+s);
		}
	}
	if(!ref_name[0].equals("")){
	for(int i=0; i<ref_name.length; i++ ) {
		bmdto.setRef_name(ref_name[i]);
		empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
		bmdto.setEmp_num(edto.getEmp_num());
		bmdto.setRef_branch(edto.getBranch2());
		bmdto.setRef_depart(edto.getDepartment2());
		bmdto.setRef_position(edto.getPosition2());
		
		sqlMap.update("bm.updateBm_ref", bmdto);
	}
}

	/*������*/

	bmdto.setBm_num(bm_num);
	
	String rec_name[] = request.getParameterValues("rec_name");
	
	if(rec_name.length > 0){
		for(String s : rec_name){
			System.out.println("--->"+s);
		}
	}
	if(!rec_name[0].equals("")){
	for(int i=0; i<rec_name.length; i++ ) {
		bmdto.setRec_name(rec_name[i]);
		empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
		bmdto.setEmp_num(edto.getEmp_num());
		bmdto.setRec_branch(edto.getBranch2());
		bmdto.setRec_depart(edto.getDepartment2());
		bmdto.setRec_position(edto.getPosition2());
		sqlMap.update("bm.updateBms_rec", bmdto);
	}
}
	String path = request.getRealPath("save"); // ���� ���
	System.out.println("3");
	String [] cfile = request.getParameterValues("cfile");
	if(cfile != null) {
		for(int i=0; i<cfile.length; i++) {
			bmdto.setOrg_file(cfile[i]);
			System.out.println("���� : "+bmdto.getOrg_file());
			
			bmdto = (bmDTO)sqlMap.queryForObject("bm.Bm_file", bmdto);
			
			/* ������ ����� ������ ���� */
			try {
				File fileF = new File(path+"\\"+bmdto.getSys_file());
				
				if(fileF.exists()) {
					fileF.delete();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("4");
		sqlMap.delete("bm.delBm_file", bmdto);
		}
	}
	
	/*�������� ���*/
	System.out.println("5");
	List<MultipartFile> fileMf = request.getFiles("org_file");
	for(MultipartFile multiFile : fileMf) {
		String fileName = multiFile.getOriginalFilename();
		System.out.println(fileName);
		if(fileName != "") {
			//bmdto.setOrg_file(fileName);
			int extFile = fileName.lastIndexOf(".");
			fileName = fileName.substring(extFile+1);
			String fmFile ="_"+bmdto.getBm_num()+"."+fileName;
		
			fmFile = fmFile.replace(" ", "");
			fmFile = fmFile.replace(":", "");
			File ff = new File(path+"//"+fmFile);
	
			try {
				multiFile.transferTo(ff);
			} catch(Exception e) {
				e.printStackTrace();
			}//������ ���� ����
			bmdto.setSys_file(fmFile);
			System.out.println("6");
			//sqlMap.insert("bm.inserBm_file", bmdto);
		}
		System.out.println("7");
	}
		/*		���������� ���
		bmdto.setBm_num(bmNum);
		sqlMap.insert("bm.insertBns_box", bmdto);*/

		System.out.println("8");

		return "/bm/BmBGList/myBmContentModifyPro";
	}
	

/*���� �������� ����  */
@RequestMapping("/SSBmContentModify.jp")
public String SSBmContentModify(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session){
int bm_num=Integer.parseInt(request.getParameter("bm_num"));
String emp_num =(String)session.getAttribute("memId");
bmdto.setEmp_num(emp_num);
bmdto.setBm_num(bm_num);
String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
bmdto = (bmDTO)sqlMap.queryForObject("bm.getEmp_name2", emp_num);	
bmdto = (bmDTO) sqlMap.queryForObject("bm.getBusinessCont", bm_num);
int countBns_box = (int) sqlMap.queryForObject("bm.countBns_box",bmdto);
List ListBns_box = sqlMap.queryForList("bm.ListBns_box", null);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

/*  ���� �ҷ����� */
List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);

model.addAttribute("bmdto", bmdto);
model.addAttribute("emp_num", emp_num);
model.addAttribute("bm_num", bm_num);
model.addAttribute("bmdto", bmdto);
model.addAttribute("sdf", sdf);		
model.addAttribute("Bm_file", Bm_file);		
model.addAttribute("fileCount", fileCount);	
model.addAttribute("countBns_box", countBns_box);
model.addAttribute("ListBns_box", ListBns_box);
model.addAttribute("bm_name",bm_name);

return "/bm/BmBGList/SSBmContentModify";

}

/*���� �������� SSBmFormModifyPro*/
@RequestMapping("/SSBmContentModifyPro.jp")
public String SSBmContentModifyPro(Model model,HttpSession session, MultipartHttpServletRequest request,bmDTO bmdto){
	System.out.println("1");
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	System.out.println(bm_num);
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	bmdto.setBm_title(request.getParameter("bm_title"));
	bmdto.setBm_content(request.getParameter("bm_content"));
	bmdto.setReg_notice(request.getParameter("reg_notice"));
	bmdto.setCmp_notice(request.getParameter("cmp_notice"));
	bmdto.setBns_box(Integer.parseInt(request.getParameter("bns_box")));
	System.out.println("2");
	
	sqlMap.update("bm.bgbmUpdate", bm_num);
	/*������*/
	bmdto.setBm_num(bm_num);
	String ref_name[] = request.getParameterValues("ref_name");
	
	if(ref_name.length > 0){
		for(String s : ref_name){
			System.out.println("--->"+s);
		}
	}
	if(!ref_name[0].equals("")){
	for(int i=0; i<ref_name.length; i++ ) {
		bmdto.setRef_name(ref_name[i]);
		empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
		bmdto.setEmp_num(edto.getEmp_num());
		bmdto.setRef_branch(edto.getBranch2());
		bmdto.setRef_depart(edto.getDepartment2());
		bmdto.setRef_position(edto.getPosition2());
		
		sqlMap.update("bm.updateBm_ref", bmdto);
	}
}

	/*������*/

	bmdto.setBm_num(bm_num);
	
	String rec_name[] = request.getParameterValues("rec_name");
	
	if(rec_name.length > 0){
		for(String s : rec_name){
			System.out.println("--->"+s);
		}
	}
	if(!rec_name[0].equals("")){
	for(int i=0; i<rec_name.length; i++ ) {
		bmdto.setRec_name(rec_name[i]);
		empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
		bmdto.setEmp_num(edto.getEmp_num());
		bmdto.setRec_branch(edto.getBranch2());
		bmdto.setRec_depart(edto.getDepartment2());
		bmdto.setRec_position(edto.getPosition2());
		sqlMap.update("bm.updateBms_rec", bmdto);
	}
}
	String path = request.getRealPath("save"); // ���� ���
	System.out.println("3");
	String [] cfile = request.getParameterValues("cfile");
	if(cfile != null) {
		for(int i=0; i<cfile.length; i++) {
			bmdto.setOrg_file(cfile[i]);
			System.out.println("���� : "+bmdto.getOrg_file());
			
			bmdto = (bmDTO)sqlMap.queryForObject("bm.Bm_file", bmdto);
			
			/* ������ ����� ������ ���� */
			try {
				File fileF = new File(path+"\\"+bmdto.getSys_file());
				
				if(fileF.exists()) {
					fileF.delete();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("4");
		sqlMap.delete("bm.delBm_file", bmdto);
		}
	}
	
	/*�������� ���*/
	System.out.println("5");
	List<MultipartFile> fileMf = request.getFiles("org_file");
	for(MultipartFile multiFile : fileMf) {
		String fileName = multiFile.getOriginalFilename();
		System.out.println(fileName);
		if(fileName != "") {
			//bmdto.setOrg_file(fileName);
			int extFile = fileName.lastIndexOf(".");
			fileName = fileName.substring(extFile+1);
			String fmFile ="_"+bmdto.getBm_num()+"."+fileName;
		
			fmFile = fmFile.replace(" ", "");
			fmFile = fmFile.replace(":", "");
			File ff = new File(path+"//"+fmFile);
	
			try {
				multiFile.transferTo(ff);
			} catch(Exception e) {
				e.printStackTrace();
			}//������ ���� ����
			bmdto.setSys_file(fmFile);
			System.out.println("6");
			//sqlMap.insert("bm.inserBm_file", bmdto);
		}
		System.out.println("7");
	}
		/*		���������� ���
		bmdto.setBm_num(bmNum);
		sqlMap.insert("bm.insertBns_box", bmdto);*/

		System.out.println("8");

		return "/bm/BmBGList/SSBmContentModifyPro";
	}
	
	
	/*���� ������û ���� ����*/
	@RequestMapping("/chzBmYCHContent.jp")
	public String chzBmYCHContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		bmDTO his = new bmDTO();
		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmYchcont", bm_num);
		his = (bmDTO) sqlMap.queryForObject("bm.gethistory", bm_num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file2", bm_num);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount2", bm_num);

		model.addAttribute("his", his);
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	

		return "/bm/BmYCHList/chzBmYCHContent";
		
	}
	
	/*������û ���� */
	
	
	@RequestMapping("bmYCH_delete.jp")
	public String bmYCH_delete(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		return "/bm/BmYCHList/bmYCH_delete";
	}
	
	/*ajax ���� */
	@RequestMapping("my_bmYCHDel.jp")
	public String my_bmYCHDel(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			
			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		return "/bm/BmYCHList/my_bmYCHDel";
	}
	
	/*���ž�����û����Ʈ����*/
	@RequestMapping("/SSBmYCHList.jp")
	public String SSBmYCHList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String rec_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SBmYCHList = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmYCHListcount", rec_name);
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("rec_name", rec_name);

	
		SBmYCHList = sqlMap.queryForList("bm.getSSBmYCHList", params);

		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SBmYCHList", SBmYCHList);
		model.addAttribute("count", count);			
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/SSBmYCHList";
		
	}
	
	/*����������û����Ʈ����*/
	@RequestMapping("/ChZBmYCHList.jp")
	public String ChZBGBmYCHList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List ChZBGBmYCHList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBmYCHListcount", ref_name);
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);

	    ChZBGBmYCHList = sqlMap.queryForList("bm.getChZBmYCHList", params);

	
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("ChZBGBmYCHList", ChZBGBmYCHList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		
		return "/bm/BmYCHList/ChZBmYCHList";
		
	}

/*----------------------------��������--------------------------------------------------------------*/
	
	/*���� �� ����������Ʈ����*/
	@RequestMapping("/myBmBGList.jp")
	public String myBmBGList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List MyBmBgList = null;
		int count = (int) sqlMap.queryForObject("bm.getMyBmBgListcount", bm_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	   
	    MyBmBgList = sqlMap.queryForList("bm.getMyBmBgList", params);
	    
	    model.addAttribute("sdf", sdf);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("MyBmBgList", MyBmBgList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		
		return "/bm/BmBGList/myBmBGList";

	}
	/*���� �� ���� ���� */
	@RequestMapping("/myBmBGContent.jp")
	public String myBmBGContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);

		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmBgcont", bm_num);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file2", bm_num);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount2", bm_num);

		
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	

		
		
		
		return "/bm/BmBGList/myBmBGContent";
		
	}
	
	/*�������� ���� */
	@RequestMapping("bmBG_delete.jp")
	public String bmBG_delete(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			
			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		return "/bm/BmBGList/bmBG_delete";
	}

	/*���� ����������Ʈ����*/
	@RequestMapping("/SSBGBmList.jp")
	public String SSBGBmList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String rec_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmBgList = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmBgListcount", rec_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("rec_name", rec_name);
	    
	    SSBmBgList = sqlMap.queryForList("bm.getSSBmBgList", params);
	    model.addAttribute("sdf", sdf);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmBgList", SSBmBgList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		
		return "/bm/BmBGList/SSBGBmList";

	}
	
	/*���� ���� ���� */
	@RequestMapping("/SSBmBGContent.jp")
	public String SSBmBGContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);

		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmBgcont", bm_num);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file2", bm_num);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount2", bm_num);

		
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	

		
		
		
		return "/bm/BmBGList/SSBmBGContent";
	}

	
	/*���� ���� ���� */
	@RequestMapping("/chzBmBGContent.jp")
	public String chzBmBGContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);

		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmBgcont", bm_num);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file2", bm_num);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount2", bm_num);

		
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	

		
		
		
		return "/bm/BmBGList/chzBmBGContent";
	}

	/*���� ����������Ʈ����*/
	@RequestMapping("/ChZBGBmList.jp")
	public String ChZBGBmList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List ChZBGBmList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBGBmListcount", ref_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    ChZBGBmList = sqlMap.queryForList("bm.getChZBGBmList", params);
	    model.addAttribute("sdf", sdf);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("ChZBGBmList", ChZBGBmList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		
		return "/bm/BmBGList/ChZBGBmList";

	}
	
/*-----------------------------��������-------------------------------------------------------------*/		
	
	/*���� �ۼ� �� ������������Ʈ����*/
	@RequestMapping("/myBmWriteList.jp")
	public String myBmWriteList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List MyBmIjList = null;
		int count = (int) sqlMap.queryForObject("bm.getBmIjListcount", bm_name);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    MyBmIjList = sqlMap.queryForList("bm.getMyBmIjList", params);

	    
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("MyBmIjList", MyBmIjList);
		model.addAttribute("count", count);	
		model.addAttribute("sdf", sdf);		
		
		return "/bm/BmList/myBmWriteList";

	}
	
	/*���� ���� ���� ����*/
@RequestMapping("/myBmIjContent.jp")
	public String myBmIjContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		
		bmDTO his = new bmDTO();
		
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmIjcont", bm_num);
		his = (bmDTO) sqlMap.queryForObject("bm.gethistory", bm_num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		/*  ���� �ҷ����� */
		List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
		int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);
		
		model.addAttribute("his", his);
		model.addAttribute("bmdto", bmdto);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("bm_num", bm_num);
		model.addAttribute("sdf", sdf);		
		model.addAttribute("Bm_file", Bm_file);		
		model.addAttribute("fileCount", fileCount);	
		
		return "/bm/BmList/myBmIjContent";
		
	}
/*�������� ���뺸��*/
@RequestMapping("/sSbmIjContent.jp")
public String sSBmIjContent(HttpServletRequest request, bmDTO bmdto,Model model,HttpSession session,bmDTO bdto){
	int bm_num=Integer.parseInt(request.getParameter("bm_num"));
	String emp_num =(String)session.getAttribute("memId");
	bmdto.setEmp_num(emp_num);
	bmdto.setBm_num(bm_num);
	bmDTO his = new bmDTO();
	String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
	bmdto = (bmDTO) sqlMap.queryForObject("bm.getBmIjcont", bm_num);
	his = (bmDTO) sqlMap.queryForObject("bm.gethistory", bm_num);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	/*  ���� �ҷ����� */
	List Bm_file = sqlMap.queryForList("bm.Bm_file", bmdto);
	int fileCount = (int)sqlMap.queryForObject("bm.Bm_filecount", bmdto);
	
	model.addAttribute("his", his);
	model.addAttribute("bmdto", bmdto);
	model.addAttribute("emp_num", emp_num);
	model.addAttribute("bm_num", bm_num);
	model.addAttribute("sdf", sdf);		
	model.addAttribute("Bm_file", Bm_file);		
	model.addAttribute("fileCount", fileCount);	
	
	return "/bm/BmList/sSbmIjContent";
	
}
	
	/*�������� ���� */
	@RequestMapping("bmIj_delete.jp")
	public String bmIj_delete(bmDTO bmdto, String pageNum,  Model model, HttpServletRequest request) { 
		String bm_num[] = request.getParameterValues("bm_num");
		String path = request.getRealPath("save");
		 System.out.println(bm_num);
		for(int i=0; i<bm_num.length; i++) {
			bmdto.setBm_num(Integer.parseInt(bm_num[i]));

			
			/* ���� ���� */
			List sys_file = sqlMap.queryForList("bm.Bm_file", bmdto);
			for(int b=0; b<sys_file.size(); b++) {
				try {
					bmDTO bmdto2 = (bmDTO)sys_file.get(b);
					File fileF = new File(path+"\\"+bmdto2.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			sqlMap.delete("bm.bmdelete_file", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_incharge", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bms_rec", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete_bm_ref", bmdto.getBm_num());
			sqlMap.delete("bm.bmdelete", bmdto.getBm_num());
		}
		
		return "/bm/BmList/bmIj_delete";
	}

	/*����  ���� ����*/
	@RequestMapping("/SSBmList.jp")
	public String SSBmList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String rec_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmIjList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBGBmListcount", rec_name);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("rec_name", rec_name);
	    
	    SSBmIjList = sqlMap.queryForList("bm.getSSBmIjList", params);
	    
	    model.addAttribute("sdf", sdf);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmIjList", SSBmIjList);
		model.addAttribute("count", count);	
		
		
		return "/bm/BmList/SSBmList";

	}
	
	/*����  ���� ����*/
	@RequestMapping("/ChZBmList.jp")
	public String ChZBmList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List ChZBGBmIjList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBGBmIjListcount", ref_name);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int number = 0;
		
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    ChZBGBmIjList = sqlMap.queryForList("bm.getChZBGBmIjList", params);
	    
	    model.addAttribute("sdf", sdf);		
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("ChZBGBmIjList", ChZBGBmIjList);
		model.addAttribute("count", count);	
		
		return "/bm/BmList/ChZBmList";

	}
	
/*------------------------------------------------------------------------------------------*/		
	
	
	/*��������� */
	@RequestMapping("/bmForm.jp")
	public String bmForm(bmDTO bmdto,Model model,HttpSession session,String dateFormatStr,HttpServletRequest request){
		int countBns_box = (int) sqlMap.queryForObject("bm.countBns_box",bmdto);
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List ListBns_box = sqlMap.queryForList("bm.ListBns_box", null);
		bmdto = (bmDTO)sqlMap.queryForObject("bm.getEmp_name2", emp_num);	
	
		model.addAttribute("bm_name",bm_name);
		model.addAttribute("bmdto",bmdto);
		model.addAttribute("emp_num",emp_num);
		model.addAttribute("countBns_box", countBns_box);
		model.addAttribute("ListBns_box", ListBns_box);
		


		return "/bm/bmForm";

	}	
	
	/*����FormPro*/
	@RequestMapping("/bmFormPro.jp")
	public String bmForm(Model model,HttpSession session, MultipartHttpServletRequest request){
		
		bmDTO bmdto = new bmDTO();
		empDTO edto2 = new empDTO();
		String emp_num =(String)session.getAttribute("memId");
		
		empDTO edto1 = (empDTO)sqlMap.queryForObject("bm.empInf",emp_num);

		
		bmdto.setEmp_num((String)session.getAttribute("memId"));   //emp_num �ҷ��ͼ� ����
		bmdto.setBm_name(edto1.getEmp_name());
		bmdto.setBm_title(request.getParameter("bm_title"));
		bmdto.setBm_content(request.getParameter("bm_content"));
		bmdto.setBm_form(Integer.parseInt(request.getParameter("bm_form")));
		bmdto.setReg_notice(request.getParameter("reg_notice"));
		bmdto.setCmp_notice(request.getParameter("cmp_notice"));
		
		/*String related_bns = request.getParameter("related_bns");
		
		if(related_bns == null) {
			bmdto.setRelated_bns(0);
		} else if(related_bns != null) {
			bmdto.setRelated_bns(Integer.parseInt(related_bns));
		}*/
		
		bmdto.setBns_box(Integer.parseInt(request.getParameter("bns_box")));
		
		String important2 = request.getParameter("important2");
		if(important2 == null) {
			bmdto.setImportant(1);
		} else if(important2 != null) {
			bmdto.setImportant(Integer.parseInt(important2));
		}
			
		bmdto.setBm_state(1); // �⺻�� : �̿Ϸ�
		/*���� �� ��¥ */
		bmdto.setBm_start(request.getParameter("bm_start"));
		bmdto.setBm_end(request.getParameter("bm_end"));
		sqlMap.insert("bm.insertBusiness", bmdto);

		int maxBmNum = (int) sqlMap.queryForObject("bm.showBmNum", null);
		/*�����*//*���� �迭�� �������ָ� �ҷ��´� (�������� ���� ���� �� )*/
		bmdto.setBm_num(maxBmNum);
		String inchar_name[] = request.getParameterValues("inchar_name");

		if(inchar_name.length > 0){
			for(String s : inchar_name){

			}
		}

		if(!inchar_name[0].equals("")){
			
			for(int i=0; i<inchar_name.length; i++ ) {
				bmdto.setInchar_name(inchar_name[i]);
				empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
				System.out.println(inchar_name[i]);
				bmdto.setEmp_num(edto.getEmp_num());
				bmdto.setInchar_branch(edto.getBranch2());
				System.out.println(edto.getBranch2());
				bmdto.setInchar_depart(edto.getDepartment2());
				bmdto.setInchar_position(edto.getPosition2());
				
				sqlMap.insert("bm.insertIncharge", bmdto);
			}
		}


		/*������*/
		bmdto.setBm_num(maxBmNum);
		String ref_name[] = request.getParameterValues("ref_name");
		
		if(ref_name.length > 0){
			for(String s : ref_name){
				System.out.println("--->"+s);
			}
		}
		if(!ref_name[0].equals("")){
		for(int i=0; i<ref_name.length; i++ ) {
			bmdto.setRef_name(ref_name[i]);
			empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
			bmdto.setEmp_num(edto.getEmp_num());
			bmdto.setRef_branch(edto.getBranch2());
			bmdto.setRef_depart(edto.getDepartment2());
			bmdto.setRef_position(edto.getPosition2());
			
			sqlMap.insert("bm.insertBm_ref", bmdto);
		}
	}
		
		
		
		/*������*/

		bmdto.setBm_num(maxBmNum);
		
		String rec_name[] = request.getParameterValues("rec_name");
		
		if(rec_name.length > 0){
			for(String s : rec_name){
				System.out.println("--->"+s);
			}
		}
		if(!rec_name[0].equals("")){
		for(int i=0; i<rec_name.length; i++ ) {
			bmdto.setRec_name(rec_name[i]);
			empDTO edto = (empDTO)sqlMap.queryForObject("bm.empInfpop",emp_num);
			bmdto.setEmp_num(edto.getEmp_num());
			bmdto.setRec_branch(edto.getBranch2());
			bmdto.setRec_depart(edto.getDepartment2());
			bmdto.setRec_position(edto.getPosition2());
			sqlMap.insert("bm.insertBms_rec", bmdto);
		}
	}
/*	
		�������� ���
		String his_process = bmdto.getHis_process();
		String his_content = bmdto.getHis_content();
		bmdto.setEmp_num(emp_num);
//		bmdto.setBm_num(bm_num);
		bmdto.setBm_num(maxBmNum);
		bmdto.setHis_process(his_process);
		bmdto.setHis_content(his_content);
		sqlMap.insert("bm.insertHistory", bmdto);
		*/
		
		/*�������� ���*/
		String path = request.getRealPath("save"); // ���ε� ���
		bmdto.setBm_num(maxBmNum);		
		List<MultipartFile> fileMf = request.getFiles("org_file");
		for(MultipartFile multiFile : fileMf) {
			String fileName = multiFile.getOriginalFilename();
			
			if(fileName != "") {
				bmdto.setOrg_file(fileName);
				int extFile = fileName.lastIndexOf(".");
				fileName = fileName.substring(extFile+1);
				String fmFile = bmdto.getEmp_num()+"_"+bmdto.getBm_num()+"."+fileName;
			
				fmFile = fmFile.replace(" ", "");
				fmFile = fmFile.replace(":", "");
				File ff = new File(path+"//"+fmFile);
		
				try {
					multiFile.transferTo(ff);
				} catch(Exception e) {
					e.printStackTrace();
				}//��������
				bmdto.setSys_file(fmFile);
			
				sqlMap.insert("bm.inserBm_file", bmdto);
			}
			
		}


/*		���������� ���
		bmdto.setBm_num(bmNum);
		sqlMap.insert("bm.insertBns_box", bmdto);*/


		return "/bm/bmFormPro";

	}
	
	
	/*	�������� ���hisrory*/
	@RequestMapping("/insertHistory.jp")
	public String insertHistory(Model model,HttpSession session, MultipartHttpServletRequest request){
		
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		bmDTO bmdto = new bmDTO();
		empDTO edto2 = new empDTO();
		String emp_num =(String)session.getAttribute("memId");
		
		empDTO edto1 = (empDTO)sqlMap.queryForObject("bm.empInf",emp_num);

		String his_process = bmdto.getHis_process();
		String his_content = bmdto.getHis_content();
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(Integer.parseInt(request.getParameter("bm_num")));
		bmdto.setHis_process(request.getParameter("his_process"));
		bmdto.setHis_content(request.getParameter("his_content"));
		sqlMap.insert("bm.insertHistory", bmdto);

		
		/*�������� ���*/
		String path = request.getRealPath("save"); // ���ε� ���
		bmdto.setBm_num(Integer.parseInt(request.getParameter("bm_num")));
		List<MultipartFile> fileMf = request.getFiles("org_file");
		for(MultipartFile multiFile : fileMf) {
			String fileName = multiFile.getOriginalFilename();
			
			if(fileName != "") {
				bmdto.setOrg_file(fileName);
				int extFile = fileName.lastIndexOf(".");
				fileName = fileName.substring(extFile+1);
				String fmFile = bmdto.getEmp_num()+"_"+bmdto.getBm_num()+"."+fileName;
			
				fmFile = fmFile.replace(" ", "");
				fmFile = fmFile.replace(":", "");
				File ff = new File(path+"//"+fmFile);
		
				try {
					multiFile.transferTo(ff);
				} catch(Exception e) {
					e.printStackTrace();
				}//���������� 
				bmdto.setSys_file(fmFile);
			
				sqlMap.insert("bm.inserBm_file", bmdto);
				
			}
			sqlMap.update("bm.state_update2", bm_num);
			
		}

		return "/bm/insertHistory";

	}

	
	
	
	/*���� �������� myBmFormModifyPro*/
	@RequestMapping("/myBmFormModifyPro.jp")
	public String myBmFormModifyPro(Model model,HttpSession session, MultipartHttpServletRequest request){
		
		bmDTO bmdto = new bmDTO();

		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		String emp_num =(String)session.getAttribute("memId");
		bmdto.setEmp_num(emp_num);
		bmdto.setBm_num(bm_num);
		bmdto.setBm_title(request.getParameter("bm_title"));
		bmdto.setBm_content(request.getParameter("bm_content"));
		bmdto.setReg_notice(request.getParameter("reg_notice"));
		bmdto.setCmp_notice(request.getParameter("cmp_notice"));
		bmdto.setBns_box(Integer.parseInt(request.getParameter("bns_box")));
		
		/*���� �� ��¥ */
		bmdto.setBm_start(request.getParameter("bm_start"));
		bmdto.setBm_end(request.getParameter("bm_end"));
		sqlMap.update("bm.bmUpdate", bm_num);
		
		String path = request.getRealPath("save"); // ���� ���
		String [] cfile = request.getParameterValues("cfile");
		if(cfile != null) {
			for(int i=0; i<cfile.length; i++) {
				bmdto.setOrg_file(cfile[i]);
				System.out.println("���� : "+bmdto.getOrg_file());
				
				bmdto = (bmDTO)sqlMap.queryForObject("bm.Bm_file", bmdto);
				
				/* ������ ����� ������ ���� */
				try {
					File fileF = new File(path+"\\"+bmdto.getSys_file());
					
					if(fileF.exists()) {
						fileF.delete();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			sqlMap.delete("bm.delBm_file", bmdto);
			}
		}
		
		/*�������� ���*/
		List<MultipartFile> fileMf = request.getFiles("org_file");
		for(MultipartFile multiFile : fileMf) {
			String fileName = multiFile.getOriginalFilename();
			System.out.println(fileName);
			if(fileName != "") {
				//bmdto.setOrg_file(fileName);
				int extFile = fileName.lastIndexOf(".");
				fileName = fileName.substring(extFile+1);
				String fmFile ="_"+bmdto.getBm_num()+"."+fileName;
			
				fmFile = fmFile.replace(" ", "");
				fmFile = fmFile.replace(":", "");
				File ff = new File(path+"//"+fmFile);
		
				try {
					multiFile.transferTo(ff);
				} catch(Exception e) {
					e.printStackTrace();
				}//������ ���� ����
				bmdto.setSys_file(fmFile);
				sqlMap.insert("bm.inserBm_file", bmdto);
			}
			
		}


		return "/bm/myBmFormModifyPro";

	}
	
	
	/*�����incharPop*/
	
	@RequestMapping("/incharPop.jp")
	public String incharPop(HttpServletRequest request, HttpSession session, Model model){
		String id = request.getParameter("id");
		int count = (int) sqlMap.queryForObject("bm.empFindCnt", id);
		
		List articleList = null;
		articleList = sqlMap.queryForList("bm.empFind",id);
		model.addAttribute("count", count);
		model.addAttribute("articleList", articleList);		
		
		
		return "/bm/incharPop";

	}
	
	
	
	/*������ rec_Pop*/
	
	@RequestMapping("/bms_recPop.jp")
	public String bms_recPop(HttpServletRequest request,HttpSession session, Model model){
		
		String id = request.getParameter("id");
		int count = (int) sqlMap.queryForObject("bm.empFindCnt", id);
		
		List articleList = null;
		articleList = sqlMap.queryForList("bm.empFind",id);
		model.addAttribute("count", count);
		model.addAttribute("articleList", articleList);		
		
		
		
		/*String emp_num = (String) session.getAttribute("memId");
		List emp_d2 = sqlMap.queryForList("bm.bm_de_department",null);
		List emp_d = sqlMap.queryForList("bm.bm_org_department",null);
		List dp = sqlMap.queryForList("bm.emp_department",null);
		int count = (int) sqlMap.queryForObject("bm.bm_empCount",emp_num);
		List articleList = null;
		articleList = sqlMap.queryForList("employee.memberAll", articleList);		
		model.addAttribute("articleList", articleList);	
		model.addAttribute("count", count);
		model.addAttribute("dp",dp);
		model.addAttribute("emp_d2",emp_d2);
		model.addAttribute("emp_d",emp_d);*/
		
		return "/bm/bms_recPop";

	}
	
	
	
	
/*������ ref_Pop*/
	
	@RequestMapping("/refPop.jp")
	public String refPop(HttpServletRequest request, HttpSession session, Model model){

		String id = request.getParameter("id");
		int count = (int) sqlMap.queryForObject("bm.empFindCnt", id);
		
		List articleList = null;
		articleList = sqlMap.queryForList("bm.empFind",id);
		model.addAttribute("count", count);
		model.addAttribute("articleList", articleList);		
		
		/*		String emp_num = (String) session.getAttribute("memId");
		List emp_d2 = sqlMap.queryForList("bm.bm_de_department",null);
		List emp_d = sqlMap.queryForList("bm.bm_org_department",null);
		List dp = sqlMap.queryForList("bm.emp_department",null);
		int count = (int) sqlMap.queryForObject("bm.bm_empCount",emp_num);
		List articleList = null;
		articleList = sqlMap.queryForList("employee.memberAll", articleList);		
		model.addAttribute("articleList", articleList);	
		model.addAttribute("count", count);
		model.addAttribute("dp",dp);
		model.addAttribute("emp_d2",emp_d2);
		model.addAttribute("emp_d",emp_d);
*/		return "/bm/refPop";

	}
	
	/*���þ��� */
	@RequestMapping("/related_bns.jp")
	public String related_bns(Model model,empDTO dto,HttpSession session){

		
		String emp_num = (String) session.getAttribute("memId");
		List emp_d2 = sqlMap.queryForList("bm.bm_de_department",null);
		List emp_d = sqlMap.queryForList("bm.bm_org_department",null);
		List dp = sqlMap.queryForList("bm.emp_department",null);
		int count = (int) sqlMap.queryForObject("bm.bm_empCount",emp_num);
		
		model.addAttribute("count", count);
		model.addAttribute("dp",dp);
		model.addAttribute("emp_d2",emp_d2);
		model.addAttribute("emp_d",emp_d);

		return "/bm/related_bns";

	}	
	
/*------------------------------------------------------------------------------------------*/		
/*	����(������)
	@RequestMapping("/bm_delete1.jp")
	public String bm_delete1(Model model,empDTO dto,HttpSession session){
		return "/bm/bm_delete1";
	}

	����(��������)
	@RequestMapping("/bm_delete2.jp")
	public String bm_delete2(Model model,empDTO dto,HttpSession session){
		
		return "/bm/bm_delete2";
	}
*/
/*--------------���ϴٿ�----------------------------------------------------------------------------*/
	@RequestMapping(value={"/bmFileDown.jp"})
	public ModelAndView bmFileDown(String fileName, HttpServletRequest request) {
		String dir = request.getRealPath("save");
		File f = new File(dir+"//"+fileName);
		ModelAndView mv = new ModelAndView("down", "downloadFile", f);
		return mv;
	}
	/*--------------�����Ϸ�(���°�) ����  ----------------------------------------------------------------------------*/
	/*���� ���� */
	@RequestMapping("/mytodo_state_update.jp")
	public String mytodo_state_update(bmDTO bmdto, HttpServletRequest request) {
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
/*		bmdto.setBm_num(bm_num);*/
		sqlMap.update("bm.state_update2",bm_num);
		sqlMap.update("bm.date_update",bm_num);
		
		return "/bm/mytodo/mytodo_state_update";
	}
	
	/*���Ǿ��� �Ϸ� ����Ʈ */
	@RequestMapping("/mytodook.jp")
	public String mytodook(bmDTO bmdto, HttpSession session, Model model,String pageNum){
		
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List mytodook = null;
		int count = (int) sqlMap.queryForObject("bm.getmytodookcount", bm_name);

		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.
	

		if(pageNum == null) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		int number = 0;
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    mytodook = sqlMap.queryForList("bm.mytodook", params);

		System.out.println(mytodook);
		model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("mytodook", mytodook);
		model.addAttribute("count", count);			
		return "/bm/mytodo/mytodook";
	}	
	
	
	/*������û �Ϸ���·� */
	@RequestMapping("/bmYCH_state_finish.jp")
	public String bmYCH_state_finish(bmDTO bmdto, HttpServletRequest request) {
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
/*		bmdto.setBm_num(bm_num);*/
		sqlMap.update("bm.state_update2",bm_num);
		sqlMap.update("bm.date_update",bm_num);
		return "/bm/BmYCHList/bmYCH_state_finish";
	}
	
	
	/*���� �� ������û�Ϸ� ����Ʈ����*/
	@RequestMapping("/myBmYCHokList.jp")
	public String myBmYCHokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List MyBmYchokList = null;
		int count = (int) sqlMap.queryForObject("bm.getMyBmYchListokcount", bm_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    MyBmYchokList = sqlMap.queryForList("bm.getMyBmYchListok", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("MyBmYchokList", MyBmYchokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/myBmYCHokList";
		
	}

	/*������û �ݷ� */
	@RequestMapping("/bmYCH_state_nonfinish.jp")
	public String bmYCH_state_nonfinish(bmDTO bmdto, HttpServletRequest request) {
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
/*		bmdto.setBm_num(bm_num);*/
		sqlMap.update("bm.state_update0",bm_num);
		sqlMap.update("bm.date_update",bm_num);
		
		return "/bm/BmYCHList/bmYCH_nonstate_finish";
	}
	/*���� �� ������û�ݷ� ����Ʈ����*/
	@RequestMapping("/myBmYCHnoList.jp")
	public String myBmYCHnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List MyBmYchokList = null;
		int count = (int) sqlMap.queryForObject("bm.getMyBmYchListnocount", bm_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    MyBmYchokList = sqlMap.queryForList("bm.getMyBmYchListno", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("MyBmYchokList", MyBmYchokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/myBmYCHnoList";
		
	}	
	
	/*���� ������û�Ϸ� ����Ʈ����*/
	@RequestMapping("/SSBmYCHokList.jp")
	public String SSBmYCHokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmYCHListok = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmYCHokcount", bm_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    SSBmYCHListok = sqlMap.queryForList("bm.SSBmYCHListok", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmYCHListok", SSBmYCHListok);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/SSBmYCHokList";
		
	}

	/*���� ������û�ݷ� ����Ʈ����*/
	@RequestMapping("/SSBmYCHnoList.jp")
	public String SSBmYCHnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmYchnoList = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmYCHnocount", bm_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    SSBmYchnoList = sqlMap.queryForList("bm.SSBmYCHListno", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmYchnoList", SSBmYchnoList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/SSBmYCHnoList";
		
	}	
	
	/*���� ������û�Ϸ� ����Ʈ����*/
	@RequestMapping("/cHzBmYCHokList.jp")
	public String cHzBmYCHokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List cHzBmYCHokList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBmYCHokcount", ref_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    cHzBmYCHokList = sqlMap.queryForList("bm.ChZBmYCHListok", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("cHzBmYCHokList", cHzBmYCHokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmYCHList/cHzBmYCHokList";
		
	}

	/*���� ������û�ݷ� ����Ʈ����*/
	@RequestMapping("/cHzBmYCHnoList.jp")
	public String cHzBmYCHnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List cHzBmYCHnoList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBmYCHnocount", ref_name);
		int number = 0;
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    cHzBmYCHnoList = sqlMap.queryForList("bm.ChZBmYCHnoList", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("cHzBmYCHnoList", cHzBmYCHnoList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);

		return "/bm/BmYCHList/cHzBmYCHnoList";
		
	}		
	
	/*�������� �Ϸ���·� */
	@RequestMapping("/bmBG_state_update.jp")
	public String bmBG_state_update(bmDTO bmdto, HttpServletRequest request) {
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		sqlMap.update("bm.state_update2",bm_num);
		sqlMap.update("bm.date_update",bm_num);

		return "/bm/BmBGList/bmBG_state_update";
	}
	
	/*�������� �ݷ� */
	@RequestMapping("/bmBG_state_nonfinish.jp")
	public String bmBG_state_nonfinish(bmDTO bmdto, HttpServletRequest request) {
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
/*		bmdto.setBm_num(bm_num);*/
		sqlMap.update("bm.state_update0",bm_num);
		sqlMap.update("bm.date_update",bm_num);
		
		return "/bm/BmBGList/bmBG_state_nonfinish";
	}
	
	/*���� �� �������� �Ϸ� ����Ʈ����*/
	@RequestMapping("/myBmBGokList.jp")
	public String myBmBGokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List myBmBGokList = null;
		int count = (int) sqlMap.queryForObject("bm.getMyBmBgListokcount", bm_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    myBmBGokList = sqlMap.queryForList("bm.getMyBmBgListok", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("myBmBGokList", myBmBGokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		model.addAttribute("sdf", sdf);
		
		return "/bm/BmBGList/myBmBGokList";
	}
	
	/*���� �� �������� �ݷ� ����Ʈ����*/
	@RequestMapping("/myBmBGnoList.jp")
	public String myBmBGnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String bm_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List myBmBGnoList = null;
		int count = (int) sqlMap.queryForObject("bm.getMyBmBgListnocount", bm_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("bm_name", bm_name);
	    
	    myBmBGnoList = sqlMap.queryForList("bm.getMyBmBgListno", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("myBmBGnoList", myBmBGnoList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		model.addAttribute("sdf", sdf);
		
		return "/bm/BmBGList/myBmBGnoList";
		
	}	
	
	/*���� �������� �Ϸ� ����Ʈ����*/
	@RequestMapping("/SSBmBGokList.jp")
	public String SSBmBGokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String rec_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmBGokList = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmBgokcount", rec_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("rec_name", rec_name);
	    
	    SSBmBGokList = sqlMap.queryForList("bm.SSBmBgListok", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmBGokList", SSBmBGokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		model.addAttribute("sdf", sdf);
		
		return "/bm/BmBGList/SSBmBGokList";
		
	}

	/*���� �������� �ݷ� ����Ʈ����*/
	@RequestMapping("/SSBmBGnoList.jp")
	public String SSBmBGnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String rec_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List SSBmBGnoList = null;
		int count = (int) sqlMap.queryForObject("bm.getSSBmBgnocount", rec_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("rec_name", rec_name);
	    
	    SSBmBGnoList = sqlMap.queryForList("bm.SSBmBgListno", params);
	    
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("SSBmBGnoList", SSBmBGnoList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
		model.addAttribute("sdf", sdf);
		
		return "/bm/BmBGList/SSBmBGnoList";
		
	}	
	
	/*���� �������� �Ϸ� ����Ʈ����*/
	@RequestMapping("/cHzBmBGokList.jp")
	public String cHzBmBGokList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List cHzBmBGokList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBGBmokcount", ref_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    cHzBmBGokList = sqlMap.queryForList("bm.ChZBGBmListok", params);
	    
	    model.addAttribute("sdf", sdf);
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("cHzBmBGokList", cHzBmBGokList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmBGList/cHzBmBGokList";
		
	}

	/*���� �������� �ݷ� ����Ʈ����*/
	@RequestMapping("/cHzBmBGnoList.jp")
	public String cHzBmBGnoList(bmDTO bmdto,Model model,HttpSession session,bmDTO bdto,String pageNum){
		String emp_num = (String)session.getAttribute("memId");	
		bmdto.setEmp_num(emp_num);
		String ref_name = (String)sqlMap.queryForObject("bm.getEmp_name1", emp_num);
		List cHzBmBGnoList = null;
		int count = (int) sqlMap.queryForObject("bm.getChZBGBmnocount", ref_name);
		int number = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageSize = 10; // ���� �Ķ���͸� �޾Ƽ� �ؾ���.

		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int pageCount =0;
		int startPage = (int)(currentPage/10)*10+1;
		int pageBlock = 10;
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
		}

		pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		number=count-(currentPage-1)*pageSize;
		
		HashMap params = new HashMap();
	    params.put("startRow", startRow);
	    params.put("endRow", endRow);
	    params.put("ref_name", ref_name);
	    
	    cHzBmBGnoList = sqlMap.queryForList("bm.ChZBGBmListno", params);
	    model.addAttribute("sdf", sdf);
	    model.addAttribute("emp_num", emp_num);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("endPage", endPage);
		model.addAttribute("cHzBmBGnoList", cHzBmBGnoList);
		model.addAttribute("count", count);	
		model.addAttribute("number", number);
	
		return "/bm/BmBGList/cHzBmBGnoList";
		
	}		
	

	
	
/*--------------�����߿�üũ----------------------------------------------------------------------------*/
	
	/*���Ǿ���*/
	@RequestMapping("MybmImportantChange.jp")
	public @ResponseBody int Imp(HttpServletRequest request, bmDTO bmdto, Model model) {
		
		/*String pageNum = request.getParameter("pageNum");*/
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		int important = (int)sqlMap.queryForObject("bm.getimp",bm_num);
		System.out.println(bm_num);
		System.out.println(important);
		
		
			sqlMap.update("bm.bmImportantChange1", bm_num);
		
		

		/*model.addAttribute("pageNum", pageNum);*/

				
		return bm_num;
	}		
	

	/*������û*/
	@RequestMapping("bmYCHImportantChange.jp")
	public String bmYCHImportantChange(HttpServletRequest request, bmDTO bmdto, Model model) {
		
		String pageNum = request.getParameter("pageNum");
		int important = Integer.parseInt(request.getParameter("important"));
		if(important == 1) {
			bmdto.setImportant(2);
		} else if(important == 2) {
			bmdto.setImportant(1);
		}
		
		sqlMap.update("bm.bmStateChange", bmdto);
		
		model.addAttribute("pageNum", pageNum);

				
		return "/bm/BmYCHList/bmYCHImportantChange";
	}
	
	/*��������*/
	@RequestMapping("bmIjImportantChange.jp")
	public String bmIjImportantChange(HttpServletRequest request, bmDTO bmdto, Model model) {
		
		String pageNum = request.getParameter("pageNum");
		int important = Integer.parseInt(request.getParameter("important"));
		if(important == 1) {
			bmdto.setImportant(2);
		} else if(important == 2) {
			bmdto.setImportant(1);
		}
		
		sqlMap.update("bm.bmStateChange", bmdto);
		
		model.addAttribute("pageNum", pageNum);

				
		return "/bm/BmList/bmIjImportantChange";
	}	
	
	/*��������*/
	@RequestMapping("bmBgImportantChange.jp")
	public String bmBgImportantChange(HttpServletRequest request, bmDTO bmdto, Model model) {
		
		String pageNum = request.getParameter("pageNum");
		int bm_num=Integer.parseInt(request.getParameter("bm_num"));
		int important = Integer.parseInt(request.getParameter("important"));
		if(important == 1) {
			bmdto.setImportant(2);
		} else if(important == 2) {
			bmdto.setImportant(1);
		}
		
		sqlMap.update("bm.bmStateChange", bmdto);
		
		model.addAttribute("pageNum", pageNum);

				
		return "/bm/BmBGList/MybmImportantChange";
	}		

	
}

