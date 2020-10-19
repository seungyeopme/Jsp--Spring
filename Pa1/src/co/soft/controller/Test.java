package co.soft.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;

@Controller
public class Test {
	
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}
	
	@GetMapping("/t2")
	public String t2(HttpServletRequest request) {
		request.setAttribute("data1", 10);
		request.setAttribute("data2", 20);
		
		return "t2";
	}
	@GetMapping("/t3")
	public String t3(Model model) {
		model.addAttribute("data1", 30);
		model.addAttribute("data2", 40);
		
		return "t3";
	}
	@GetMapping("/t4")
	public ModelAndView t4(ModelAndView ma) {
		ma.addObject("data1", 50);
		ma.addObject("data2", 60);
		
		ma.setViewName("t4");
		return ma;
	}
}