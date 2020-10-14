package co.soft.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Scope가 prototype이기 때문에 싱글톤 x
@Component

//getBean 메소드를 호출할 때마다 객체 생성
@Scope("prototype")

public class Test4 {
	public Test4() {
		System.out.println("test4");
	}
}
