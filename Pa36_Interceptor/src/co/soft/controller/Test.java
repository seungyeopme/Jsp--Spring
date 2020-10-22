package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//false를 반환하면 요청 처리 진행 중단된다.
//Controller의 메소드가 호출되기 전에 호출된다.
public class Test {
	@GetMapping("/input")
	public String input() {
		System.out.println("input");
		return "input";
	}
}