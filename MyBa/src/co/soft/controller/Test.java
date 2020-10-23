package co.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.soft.beans.Data1;
import co.soft.dao.Mapping;

@Controller
public class Test {
	
	@Autowired
	Mapping map;
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	@PostMapping("/input1")
	public String input1(Data1 d1) {
		map.in_data(d1);
		
		return "input1";
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		
		List<Data1> li = map.sel_data();
		model.addAttribute("li", li);
		
		return "result";
	}
}