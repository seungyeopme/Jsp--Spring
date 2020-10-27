package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class HomeController {
//컨트롤러 메소드가 반환하는 jsp이름 앞뒤에 경로, 확장자를 붙여준다.	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String haaaome() {
		System.out.println("home");
		return "index";
	}
	
}
