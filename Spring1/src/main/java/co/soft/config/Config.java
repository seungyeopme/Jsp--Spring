package co.soft.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.soft.beans.Data;
import co.soft.beans.Data2;
import co.soft.beans.Data3;
import co.soft.beans.Test;
import co.soft.beans.Test2;
import co.soft.beans.Test3;

@Configuration
public class Config {

	@Bean
	public Test test1() {
		return new Test(30,"aa",new Data());
	}
	
	@Bean
	public Test test2() {
		Test t1=new Test();
		t1.setD1(400);
		t1.setD2("nn");
		t1.setD3(new Data());
		
		return t1;
	}
	@Bean
	public Data2 d1() {
		return new Data2();
	}
	@Bean
	public Data2 d2() {
		return new Data2();
	}
	@Bean(autowire=Autowire.BY_NAME)
	public Test2 test3() {
		return new Test2();
	}
	
	@Bean
	public Data3 test100() {
		return new Data3();
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public Test3 test4() {
		return new Test3();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
