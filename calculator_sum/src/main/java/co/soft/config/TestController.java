package co.soft.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(value="/test1",method = RequestMethod.GET)
	public String test1(HttpServletRequest request) {
		int a=Integer.parseInt(request.getParameter("a"));
		int b=Integer.parseInt(request.getParameter("b"));
		int c=Integer.parseInt(request.getParameter("c"));
		
		System.out.println("test1_get:"+a+":"+b+":"+c);
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		request.setAttribute("c", c);
		
		return "test1";
	}

	@RequestMapping(value="/test2",method = RequestMethod.POST)
	public String test2(@RequestParam int a, @RequestParam int b,Model model) {
		
		System.out.println("test2_post:"+a+":"+b);
		model.addAttribute("a",a);
		model.addAttribute("b",b);
		
		return "/sub1/test2";
	}
	
	
}
