package co.soft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;

@Controller
public class Test {
	//같은 타입 주입시켜서 출력까지~
	@Autowired
	Data1 session1;
	
	@GetMapping("/t1")
	public String t1() {
		session1.setS1("수정");
		session1.setS2("경찬");
		return "t1";
	}
	
	@GetMapping("/r1")
	public String r1(Model model) {
		
		System.out.println(session1.getS1());
		System.out.println(session1.getS2());
		
		model.addAttribute("session1", session1);
		return "r1";
	}
}