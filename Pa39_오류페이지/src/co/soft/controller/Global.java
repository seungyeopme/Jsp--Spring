package co.soft.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global extends RuntimeException {
	
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String str() {
		return "error1";
	}
}