package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}
}