package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	//t3 => modelandview
	@GetMapping("/t3")
	public ModelAndView t3(ModelAndView ma) {
		ma.addObject("s3","ccc");
		
		ma.setViewName("forward:r3");
		
		return ma;
	}
	
	@GetMapping("/r3")
	public String r3(HttpServletRequest request) {
		String s3 =(String)request.getAttribute("s3");
		System.out.println(s3);
		return "r3";
	}
	//t4 => model안에 data1에 객체 만들어서 setS1, setS2() 사용해서
	@GetMapping("/t4")
	public String t4(Model model) {
		Data1 d1 = new Data1();
		d1.setS1("주희");
		d1.setS2("슬기");
		
		model.addAttribute("d1", d1);
		return "forward:r4";
	}
	@GetMapping("/r4")
	public String r4(HttpServletRequest request) {
		String s4 =(String)request.getAttribute("s4");
		System.out.println(s4);
		return "r4";
	}
	
	//t5 => modelAttribute("")Data1 d1
	@GetMapping("/t5")
	public String t5(@ModelAttribute("d1") Data1 d1) {
		d1.setS1("준호");
		d1.setS2("두희");
		
		return "forward:r5";
	}
	
	@GetMapping("/r5")
	public String r5(HttpServletRequest request) {
		Data1 d1 = (Data1)request.getAttribute("d1");
		System.out.println(d1.getS1());
		System.out.println(d1.getS2());
		
		return "r5";
	}
}