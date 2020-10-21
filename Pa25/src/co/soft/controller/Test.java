package co.soft.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
	
@Controller
public class Test {
	
	@Autowired
	Data1 app1;
	
	@Resource(name="app2")
	Data2 app2;
	
	@GetMapping("/t1")
	public String t1() {
		app1.setS1("유강");
		app1.setS2("준");
		
		return "t1";
	}
	
	@GetMapping("/r1")
	public String r1(Model model) {
		System.out.println(app1.getS1());
		System.out.println(app1.getS2());
		
		return "r1";
	}	
}