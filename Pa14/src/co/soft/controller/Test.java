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
	public String t1() {
		return "redirect:/s1";
	}
	@GetMapping("/s1")
	public String s1() {
		return "s1";
	}
	@GetMapping("/t2")
	public String t2() {
		return "forward:/s2";
	}
	@GetMapping("/s2")
	public String s2() {
		return "s2";
	}
}