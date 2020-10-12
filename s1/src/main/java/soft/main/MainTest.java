package soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import soft.beans.Test;

public class MainTest {

	public static void main(String[] args) {
	
		//xml 로딩시켜서 출력해주세요.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("co/soft/config/beans.xml");
		
		Test t=ctx.getBean("test1",Test.class);
		System.out.println(t);
		
		Test t11=ctx.getBean("test1",Test.class);
		System.out.println(t11);
		
		
		Test t2=ctx.getBean("test2",Test.class);
		System.out.println(t2);
		
		Test t22=ctx.getBean("test2",Test.class);
		System.out.println(t22);
		
		
		Test t3=ctx.getBean("test3",Test.class);
		System.out.println(t3);
		
		Test t33=ctx.getBean("test3",Test.class);
		System.out.println(t33);
		
		
		ctx.close();
	}
}
