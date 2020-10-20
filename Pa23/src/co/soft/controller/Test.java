package co.soft.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;

@Controller
public class Test {
	
	@Autowired
	
	//Appplication Scope 동안 사용할 수 있는 메모리 영역이 만들어진다.
	//ServletContext라는 클래스 타입의 객체로 관리됨
	ServletContext app;
	
	//ServletContext: HttpServletRequest 객체로부터 추출 가능 Controller에서 주입 받을 수 있다.
	@GetMapping("/t1")
	public String t1() {
		app.setAttribute("s1", "승철");
		
		Data1 d1 = new Data1();
		d1.setS1("s1");
		d1.setS2("s2");
		
		app.setAttribute("d1", d1);
		
		return "t1";
	}
	
	@GetMapping("r1")
	public String r1() {
		String s1 = (String)app.getAttribute("s1");
		
		System.out.println(s1);
		
		Data1 d1 = (Data1)app.getAttribute("d1");
		System.out.println(d1.getS1());
		System.out.println(d1.getS2());
		
		return "r1";
	}
}