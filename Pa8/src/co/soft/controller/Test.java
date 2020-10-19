package co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;

@Controller
public class Test {
	@RequestMapping(value = "/t2",method = RequestMethod.GET)
	public ModelAndView t2(@RequestParam int a,@RequestParam int b) {
		ModelAndView mv = new ModelAndView();

		int result = a * b;
		mv.addObject("n1", a);
		mv.addObject("n2", b);
		mv.addObject("result", result);
		mv.setViewName("index");
		return mv;
	}
}