package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.soft.beans.Test2;

@Configuration
@ComponentScan(basePackages="co.soft.beans")
public class Config {

	@Bean
	public Test2 t5() {
		return new Test2();
	}
	
	@Bean
	public Test2 t6() {
		return new Test2();
	}
}