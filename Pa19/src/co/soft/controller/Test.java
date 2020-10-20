package co.soft.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.soft.beans.Data1;
import co.soft.beans.Data2;

@Controller
@SessionAttributes({"session1", "session2"})
//Session영역에 저장되어 있는 객체를 사용하고자 할 때 메소드의 매개변수이다.
//이 어노테이션을 설정하면 Session영역에 저장되어 있는 Bean을
//주입받을 수 있다.

public class Test{
	
	@ModelAttribute("session1") // -> s1
	public Data1 session1() {
		return new Data1();
	}
	
	@ModelAttribute("session2") // -> s2
	public Data1 session2() {
		return new Data1();
	}
	
	@GetMapping("/t1")
	public String t1(HttpSession session) {
		session.setAttribute("s1", "승철");
		return "t1";
	}
	
	@GetMapping("/t2")
	public String t2(HttpSession session) {
		session.setAttribute("s1", "승엽");
		return "redirect:/r1";
	}
	
	@GetMapping("/r1")
	public String r1(HttpSession session) {
		String s1 = (String)session.getAttribute("s1");
		System.out.println(s1);
		return "r1";
	}
	
	@GetMapping("/t3")
	public String t3(HttpSession session) {
		session.setAttribute("s1", "효준");
		return "forward:/r1";
	}
}