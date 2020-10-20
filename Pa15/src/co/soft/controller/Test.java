package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;

@Controller
public class Test{
	
	@GetMapping("/t1")
	public String t1(HttpServletRequest request) {
		//s1에다가 문자열 설정
		request.setAttribute("s1", "bts");
		return "forward:r1";
	}
	@GetMapping("/r1")
	public String r1(HttpServletRequest request) {
		String s1 =(String)request.getAttribute("s1");
		System.out.println(s1);
		return "r1";
	}
	/*
	 * @GetMapping("/r1") public String r1() { return "r1"; }
	 */
	
	//t2는 Model클래스, r2
	@GetMapping("/t2")
	public String t2(Model model) {
		model.addAttribute("s2", "army");
		return "forward:r2";
	}
	
	@GetMapping("/r2")
	public String r2(HttpServletRequest request) {
		String s2 =(String)request.getAttribute("s2");
		System.out.println(s2);
		return "r2";
	}
	
}