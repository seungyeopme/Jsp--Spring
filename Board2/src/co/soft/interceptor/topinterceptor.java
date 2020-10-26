package co.soft.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.soft.beans.BoardInfo;
import co.soft.service.topservice;

//▪   Spring Framework 강좌에서 배웠던 AOP를 적용한 Spring MVC의 요소입니다.
//▪   Interceptor는 요청 주소에 대해 관심을 갖고 요청이 발생하게 되면 요청 주소를 확인하여 Controller의 메서드를 호출 하기 전이나 후에 다른 메서드를 호출 할 수 있도록 가로 채 가는 개념입니다.
//▪   요청 발생 시 호출되는 메서드의 코드가 중복 되는 부분이 있을 때 Interceptor를 통해 처리하게 됩니다.
//▪   로그인 여부 확인, 등급별 서비스 사용 권한 확인 등의 작업을 처리할 때 많이 사용합니다.
//▪   Interceptor는 HandlerInterceptor 인터페이스를 구현하거나 HandlerInterceptorAdapter를 상속받은 클래스를 만들고 다음 메서드를 구현합니다.
//▪   preHandle : Controller의 메서드가 호출되기 전 호출됩니다. 이 메서드가 false를 반환하면 코드의 흐름이 중단됩니다.
//▪   postHandle : Controller의 메서드의 수행이 완료되고 view 처리를 수행하기 전에 호출됩니다.
//▪   afterCompletion : view 처리까지 완료되고 응답결과가 브라우저로 전달되기 전에 호출됩니다.
public class topinterceptor implements HandlerInterceptor {
	
	private topservice tservice;
	
	//생성자로 넘겨서 빈 주입 받음
	//인터셉터에서는 자동 주입을 통해 빈 주입 받지 못한다. (@Autowired 불가능)
	public topinterceptor(topservice tservice) {
		this.tservice = tservice;
	}
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response) {
		
		List<BoardInfo> topmenu = tservice.get_toplist();
		request.setAttribute("topmenu", topmenu);
	
		return true;
	}
}
