package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class HomeController {
//��Ʈ�ѷ� �޼ҵ尡 ��ȯ�ϴ� jsp�̸� �յڿ� ���, Ȯ���ڸ� �ٿ��ش�.	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String haaaome() {
		System.out.println("home");
		return "index";
	}
	
}
