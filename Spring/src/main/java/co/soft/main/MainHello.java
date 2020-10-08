package co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Hello;

public class MainHello {
	public static void main(String[] args) {
		
		//1. beans.xml 파일을 로딩한다.
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("co/soft/config/beans.xml");
		
		Hello h1=(Hello)ctx.getBean("hello"); //첫번째 방법(다운 캐스팅)
		pr(h1);
		
		Hello h2=ctx.getBean("hello",Hello.class); //두번째 방법(다운 캐스팅 x)
		pr(h2);
		
		ctx.close(); //경로 설정 닫기
	}
	public static void pr(Hello hi) {
		hi.hello();
	}
}
