package co.soft.da15.member;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MemberController {
	
	@Autowired
	@Resource(name = "memService")
	
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		
		service.register(id, pw, email);
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("email", email);
		
		return "memJoinCheck";
	}
	
	@RequestMapping(value="/memLogin" , method=RequestMethod.POST)
	public String memLogin(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Member member = service.search(id, pw);
		
		model.addAttribute("id", member.getId());
		model.addAttribute("pw", member.getPw());
		
		return "memLoginCheck"; 
	}
}
