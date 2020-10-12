package co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("co/soft/config/beans.xml");
		
		//id=test인 bean 객체 주소 받아오기
		Test t1 = ctx.getBean("test",Test.class);
		System.out.println(t1);
	}
}