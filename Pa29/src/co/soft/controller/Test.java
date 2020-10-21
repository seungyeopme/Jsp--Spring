package co.soft.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/t1")
	public String t1(Model model, Locale locale) {
		System.out.println(locale);
		String a1 = res.getMessage("aa.a1", null, null);
		String b1 = res.getMessage("bb.b1", null, null);
		
		Object[] ary = {30, "yoogang"};
		
		String a2 = res.getMessage("aa.a2", ary, null);
		String a3 = res.getMessage("aa.a3", null, locale);
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a2);
		System.out.println(a3);
		
		model.addAttribute("ary", ary);
		
		return "t1";
	}
}