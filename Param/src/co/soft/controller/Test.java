package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;


@Controller
public class Test {
	@GetMapping("/t1")
	public String t1(HttpServletRequest request) {
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}
	
	@PostMapping("/t2")
	public String t2(HttpServletRequest request) {
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}
	
	@GetMapping("/t3")
	public String t3(WebRequest request) {
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}
	
	@GetMapping("/t4/{a}/{b}/{c}")
	public String t4(@PathVariable int a, 
					 @PathVariable int b,
					 @PathVariable int c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}
	
	@GetMapping("/t5")
	public String t5(@RequestParam int a, 
					 @RequestParam int b,
					 @RequestParam int c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}
	
	@GetMapping("/t6")
	public String t6(@RequestParam(value="a") int a, 
					 @RequestParam int b,
					 @RequestParam int c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		return "result";
	}	
}