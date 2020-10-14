package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.soft.beans.Data3;
import co.soft.beans.Data4;
import co.soft.beans.Data5;
import co.soft.beans.Test3;

@Configuration

//beans..패키지 스캔
@ComponentScan(basePackages="co.soft.beans")
public class Config {
	@Bean
	public Data3 ob4() {
		return new Data3();
	}
	
	@Bean
	public Data3 ob5() {
		return new Data3();
	}
	
	@Bean
	public Test3 test20() {
		Test3 t2 = new Test3(100,"문자", new Data4(), new Data5());
		return t2;
	}
	
}