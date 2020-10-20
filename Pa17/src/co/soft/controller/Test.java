package co.soft.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.Data1;
import co.soft.beans.Data2;


@Controller
public class Test{
	//requestscope에 빈주입
	
	@Autowired //같은 타입일 때 주입
	Data1 d1;
	
	@GetMapping("/t1")
	public String t1() {
		d1.setS1("효준");
		d1.setS2("두희");
		
		return "forward:/r1";
	}
	
	@GetMapping("/r1")
	public String r1(Model model) {
		System.out.println(d1.getS1());
		System.out.println(d1.getS2());
		
		model.addAttribute("d1",d1);
		return "r1";
	}
	
	//Bean에 이름 설정
	@Resource(name="request2") 
		Data2 d2;
	
}