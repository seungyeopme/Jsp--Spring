package co.soft.beans;

import org.springframework.stereotype.Component;

//객체의 주소값 가져올 때 이름 통해서 가져온다.
@Component("t3")
public class Test2 {
	public Test2() {
		System.out.println("test2");
	}
}
