package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;

@Controller
public class Test{
	
	@GetMapping("/t1")
	public String t1(Data1 d1, Model model) {
		d1.setS1("data2");
		d1.setS2("data2");
		d1.setS3("data2");
		d1.setS4("data2");
		
		String []check = {"data1", "data3"};
		
		d1.setS5(check);
		d1.setS6(check);
		d1.setS7(check);
		d1.setS8(check);
		
		String[]dd = {"data1", "data2", "data3"};
		model.addAttribute("dd", dd);
		
		return "t1";
	}
}