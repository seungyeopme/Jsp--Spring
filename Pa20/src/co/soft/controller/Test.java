package co.soft.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;
import co.soft.beans.Data2;

@Controller
public class Test{
	
	@Autowired //같은 타입일 때 주입
	@Lazy //객체를 불러올때 바로 불러오지 않고 명령문 실행시에 불러올려고
	Data1 d1;
	
	@GetMapping("/t1")
	public String t1() {
		d1.setS1("준");
		d1.setS2("승철");
	
		return "forward:/s1"; 
	}

	@GetMapping("/s1")
	public String s1(Model model) {
		System.out.println(d1.getS1());
		System.out.println(d1.getS2());
		
		model.addAttribute("d1",d1);
		return "s1";
	}
}