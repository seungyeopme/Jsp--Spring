package co.soft.controller;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.soft.beans.Data1;

@Controller
public class Test {
	
	@GetMapping("/input")
	public String input(Data1 d1) {
		return "input";
	}
	@PostMapping("/in")
	public String in(@Valid Data1 d1, BindingResult r) {
		
		if(r.hasErrors()) {
			return "input"; //에러가 나면 
		}
		return "pass";  //에러가 안나면
	}
}