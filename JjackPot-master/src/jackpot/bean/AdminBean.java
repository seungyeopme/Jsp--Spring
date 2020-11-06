package jackpot.bean;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jackpot.DTO.empDTO;

@Controller
public class AdminBean {

	@Autowired
	private SqlMapClientTemplate sqlMap;   
	
	
	@RequestMapping("/emplist.jp")
	public String empList(empDTO dto, HttpSession session, Model model){
		int count = 0;
		List articleList = null;
		articleList = sqlMap.queryForList("employee.memberAll", articleList);
		count = (int) sqlMap.queryForObject("employee.userCnt", null);
	
		model.addAttribute("articleList", articleList);
		model.addAttribute("count", count);	
		
		return "/admin/empList";
	}
	
	
	@RequestMapping("/empmem.jp")
	public String empmem(HttpServletRequest request, empDTO dto, HttpSession session, Model model){
		String id = request.getParameter("id");
		id = id.trim();
		List articleList = null;
		dto = (empDTO) sqlMap.queryForObject("employee.member", id);
		System.out.println(dto.getProfilephoto());
	
		model.addAttribute("dto", dto);		
		
		return "/admin/empMember";
	}	
	
	
	
	@RequestMapping("/wage.jp")
	public String wage(empDTO dto, HttpSession session, Model model){
		
		List articleList = null;
		articleList = sqlMap.queryForList("employee.memberAll", articleList);		
		
		model.addAttribute("articleList", articleList);		
		
		return "/admin/wage";
	}
	
	
	
	@RequestMapping("/test2.jp")
	public String test(empDTO dto, HttpSession session, Model model){
		
		List articleList = null;
		articleList = sqlMap.queryForList("employee.memberAll", articleList);		
		model.addAttribute("articleList", articleList);		
		
		return "/admin/test";
	}
	
	
	
	
}
