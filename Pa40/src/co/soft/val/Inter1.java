package co.soft.val;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Controller
//false를 반환하면 요청 처리 진행 중단된다.
//Controller의 메소드가 호출되기 전에 호출된다.
public class Inter1 implements HandlerInterceptor {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) {
		
		System.out.println("preHandle");
		return true;
	}

	//Controller의 메소드가 호출된 후에 호출된다.
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv) throws Exception {
		
		System.out.println("postHandle");
	}
	
	//view로 완료되면 호출된다.
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {
		
		System.out.println("afterCompletion");
	}
}