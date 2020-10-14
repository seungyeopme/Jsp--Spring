package co.soft.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//getBean 메소드를 호출할 때 객체 생성
//싱글톤
@Component

//싱글톤..Lazy init true로 설정하면 id가 같지 않은 이상 객체가 따로 생성,,,
@Lazy
public class Test3 {
	public Test3() {
		System.out.println("test3");
	}
}
