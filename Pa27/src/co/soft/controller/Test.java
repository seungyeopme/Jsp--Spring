package co.soft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//@PropertySource("/WEB-INF/pro/d1.properties")
//@PropertySource(value={"/WEB-INF/pro/d1.properties","/WEB-INF/pro/d2.properties"})

@PropertySources({
	@PropertySource("/WEB-INF/pro/d1.properties"),
	@PropertySource("/WEB-INF/pro/d2.properties")
})
@Controller
public class Test {
	
	@Value("${aa.a1}")
	private int a1;
	
	@Value("${aa.a2}")
	private String a2;
	
	@Value("${bb.b1}")
	private int b1;
	
	@Value("${bb.b2}")
	private String b2;
	
	//getmapping으로 출력
	@GetMapping("/t1")
	public String t1() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(b2);
		
		return "t1";
	}
}