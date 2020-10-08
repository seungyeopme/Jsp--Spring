package co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Hello;
import co.soft.beans.Test;

public class MainTest {

	public static void main(String[] args) {
	
		//xml 로딩시켜서 출력해주세요.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("co/soft/config/beans.xml");
		
		Test t=ctx.getBean("test1",Test.class);
		System.out.println(t);
		
		ctx.close();
	}
}
