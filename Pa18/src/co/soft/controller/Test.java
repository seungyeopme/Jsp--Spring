package co.soft.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;
import co.soft.beans.Data2;

@Controller
public class Test{
	
	@GetMapping("/t1")
	public String t1() {
		return "redirect:/s1";
	}
	
	/*
	@GetMapping("/t1")
	public String t1() {
		return "forward:/s1";
	}
	*/
	
	@GetMapping("/s1")
	public String s1() {
		return "s1";
	}
}