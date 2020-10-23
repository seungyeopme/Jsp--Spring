package co.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.service.service;

@Controller

public class Test {
	
	@Autowired
	private service ser; 
	
	@GetMapping("/t1")
	public String t1(Model model) {
		
		String a = ser.se();
		model.addAttribute("a",a);
		return "t1";
	}
}