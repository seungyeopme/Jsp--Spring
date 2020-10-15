package co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test1;

public class MainClass {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext ctx1=
			new ClassPathXmlApplicationContext("co/soft/config/beans.xml");
	
		Test1 x1 = ctx1.getBean(Test1.class);
		
		try {
			x1.method1();
		} catch(Exception e) {}
		ctx1.close();
	}
}