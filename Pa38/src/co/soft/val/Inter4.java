package co.soft.val;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class Inter4 {

public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) {
		
		System.out.println("preHandle4");
		return true;
	}

	//Controller의 메소드가 호출된 후에 호출된다.
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv) throws Exception {
		
		System.out.println("postHandle4");
	}
	
	//view로 완료되면 호출된다.
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {
		
		System.out.println("afterCompletion4");
	}
}
