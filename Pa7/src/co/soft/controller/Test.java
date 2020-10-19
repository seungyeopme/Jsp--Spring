package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;

@Controller
public class Test {
	@GetMapping("/t1")
	public String t1(Data1 d1) {
		
		d1.setS1("s1");
		d1.setS2("s2");
		d1.setS3("s3");
		
		return "t1";
	}
}