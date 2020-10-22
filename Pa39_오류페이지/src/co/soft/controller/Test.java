package co.soft.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//false를 반환하면 요청 처리 진행 중단된다.
//Controller의 메소드가 호출되기 전에 호출된다.
public class Test {
	@GetMapping("/input")
	public String input(Model model) {
		int [] ary = {1,2,3};
		model.addAttribute("ary",ary[10]);
		return "input";
	}
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
		
		public String ex() {
			return "error";
		}
}

