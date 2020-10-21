package co.soft.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.Data1;
	//객체 재사용 여부: forward
	//url 변화; redirect
	//백화점 -> 다른 직원한테 물어봐서 여러분한테 알려준다(forward)
	//백화점 -> 123번호를 눌러서 다시 문의해라(redirect)
@Controller
public class Test {
	
	@RequestMapping(value="/java")
	public String java() {
		return "java";
	}
	
	@RequestMapping(value="/spring")
	public String spring(@ModelAttribute("m")Data1 d1) {
		if(d1.getS1().equals("abcd")) {
			return "redirect:r1";
		}
		else 
			return "r1";
	}	
}