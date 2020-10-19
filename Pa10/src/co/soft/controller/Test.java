package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.Data1;
/*
get방식으로 3개의 데이터를 전달하고 출력하는 프로그램
EL출력
수1: 100
수2: 200
수3: 300

스크립트릿 출력
수1: 100
수2: 200
수3: 300
*/
@Controller
public class Test{
	
	@GetMapping("/t1")
	public String t1() {
		return "index";
	}
	
	@GetMapping("/t2")
	public ModelAndView t2(ModelAndView ma) {
		ma.setViewName("index");
		return ma;
	}	
}