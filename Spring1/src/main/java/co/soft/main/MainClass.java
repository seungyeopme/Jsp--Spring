package co.soft.main;

import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test;
import co.soft.beans.Test2;
import co.soft.beans.Test3;
import co.soft.config.Config;

public class MainClass {
	public static void main(String[] args) {
		//beans.xml을 로딩해서 사용
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("co/soft/config/beans.xml");		
		
		
		Test x1=ctx.getBean("x1",Test.class);
		System.out.println(x1.getD1());
		System.out.println(x1.getD2());
		System.out.println(x1.getD3());
		
		
		
		
		
		
		
		
	}

}
