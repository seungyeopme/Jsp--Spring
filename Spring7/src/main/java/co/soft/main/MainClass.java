package co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test;
import co.soft.beans.Test2;

public class MainClass {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext ctx=
			new ClassPathXmlApplicationContext
			("co/soft/config/beans.xml");
	
		Test x1 = ctx.getBean("x1", Test.class);
		Test2 x2 = ctx.getBean("x2", Test2.class);

		co.soft.beans2.Test x3 = ctx.getBean("x3", co.soft.beans2.Test.class);
		
		x1.method1();
		x1.method1(200);
		x1.method1("문자열");
		ctx.close();
	}
}