package co.soft.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test2 {
	@GetMapping("/input1")
	public String input1() {
		ArrayList<String> a1 = null;
		a1.add("문자");
		return "input1";
	}
	
	
	
}
