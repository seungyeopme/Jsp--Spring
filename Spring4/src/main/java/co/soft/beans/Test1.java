package co.soft.beans;

import org.springframework.stereotype.Component;

//객체 생성할 때 자동으로 객체가 생성됨
//Bean 객체를 등록
//싱글톤
@Component
public class Test1 {
	public Test1() {
		System.out.println("test1");
	}
}