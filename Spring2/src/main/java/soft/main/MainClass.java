package soft.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import soft.bean.Test;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("soft/config/beans.xml");
		
		Test t1=ctx.getBean("t1",Test.class);
		List<String> l1=t1.getL1();
		for(String str:l1) {
			System.out.println(str);
		}
		
		
		ctx.close();
	}
}