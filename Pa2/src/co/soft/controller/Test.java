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
	
	@PostMapping("/t1")
	public String t1(@ModelAttribute Data1 d1) {
		
		System.out.println(d1.getData1());
		System.out.println(d1.getData2());
		
		return "t1";
	}
	@PostMapping("/t2")
	public String t2(@ModelAttribute("td") Data1 d1) {
		return "t2";
	}
}