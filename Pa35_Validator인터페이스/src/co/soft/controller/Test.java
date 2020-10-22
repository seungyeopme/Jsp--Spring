package co.soft.controller;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import co.soft.beans.Data1;
import co.soft.val.DataVal;

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
	@InitBinder
	public void initbinder(WebDataBinder binder) {
		
		DataVal v1= new DataVal();
		binder.addValidators(v1); //두 개 니까!!(s2, s3)!! 하나이면 setValidator
	}
}