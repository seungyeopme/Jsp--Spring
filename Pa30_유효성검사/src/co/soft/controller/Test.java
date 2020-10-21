package co.soft.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.soft.beans.Data1;

@Controller
public class Test {
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	@PostMapping("/in")
	public String in(@Valid Data1 d1, BindingResult r) {
		System.out.println(d1.getS1());
		System.out.println(d1.getS2());
		
		System.out.println(r);
		
		if(r.hasErrors()) {
			for(ObjectError obj:r.getAllErrors()) {
				System.out.println(obj.getDefaultMessage());
				System.out.println(obj.getCode());
				
				String [] co = obj.getCodes();
				for(String c : co) {
					System.out.println(c);
				}
				if(co[0].equals("Size.data1.s1")) {
					System.out.println("2~10글자까지");
				}
				else if(co[1].equals("Max.data1.s2")) {
					System.out.println("100이하만");
				}
			}
			return "input";
		}
		return "pass";
	}
}