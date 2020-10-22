package co.soft.val;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Inter2 extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) {
		
		System.out.println("preHandle2");
		return true;
	}

	//Controller의 메소드가 호출된 후에 호출된다.
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv) throws Exception {
		
		System.out.println("postHandle2");
	}
	
	//view로 완료되면 호출된다.
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {
		
		System.out.println("afterCompletion2");
	}
}
