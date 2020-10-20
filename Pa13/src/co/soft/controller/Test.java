package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;

@Controller
public class Test{
	
	@GetMapping("/t1")
	
	public ModelAndView sub(HttpServletRequest request) {
		
		ModelAndView ma = new ModelAndView();
		
		ma.setViewName("t1");
		
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int result = n1 + n2;
		
		request.setAttribute("n1", n1);
		request.setAttribute("n2", n2);
		request.setAttribute("result", result);
		
		return ma;
	}
}