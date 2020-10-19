package co.soft.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;

@Controller
public class Test {
	
	@GetMapping("/t1")
	public String t1(Data1 d1) {
		d1.setName("seungyeop");
		d1.setId("sy");
		d1.setPw("1234");
		return "t1";
	}
	
	@GetMapping("/t2")
	public String t2(@ModelAttribute("ma") Data1 d1) {
		d1.setName("choi");
		d1.setId("ch");
		d1.setPw("5678");
		return "t2";
	}
	
	@GetMapping("/t3")
	public String t3(Model model) {
		Data1 d1 = new Data1();
		d1.setName("lee");
		d1.setId("aa");
		d1.setPw("999");
		
		model.addAttribute("tt", d1);
		return "t3";
	}
}