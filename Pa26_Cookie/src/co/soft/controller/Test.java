package co.soft.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
	
@Controller
public class Test {
	
	@GetMapping("/save")
	
	public String sava(HttpServletResponse response) {
		
		try {
			String d1 = URLEncoder.encode("문자1", "UTF-8");
			String d2 = URLEncoder.encode("문자2", "UTF-8");
		
			Cookie c1 = new Cookie("c1", d1);
			Cookie c2 = new Cookie("c2", d2);
			
			c1.setMaxAge(365*24*60*60);
			c2.setMaxAge(365*24*60*60);
			
			response.addCookie(c1);
			response.addCookie(c2);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "save";	
	}
	@GetMapping("/cookie1")
	public String cookie1(HttpServletRequest request) {
		try {
			Cookie[] co = request.getCookies();
			
			//utf-8 코드로 인코딩해서
			//이름이 c1이면
			for(Cookie c:co) {
				String str = URLDecoder.decode(c.getValue(),"UTF-8");
				
				if(c.getName().equals("c1")) {
					System.out.println(str);
				}else if(c.getName().equals("c2")){
					System.out.println(str);
				}
				
			}
		} catch (Exception e) {}
		return "cookie1";
	}
	
	@GetMapping("/cookie2")
	public String cookie2(@CookieValue("c1") 
	String c1, @CookieValue("c2") String c2) {
		
		System.out.println(c1);
		System.out.println(c2);
		
		return "cookie2";
	}
}