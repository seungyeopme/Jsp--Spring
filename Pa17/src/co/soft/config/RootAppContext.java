package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//빈 객체 정의하는 클래스
import org.springframework.web.context.annotation.RequestScope;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
@Configuration
public class RootAppContext {
	@Bean
	@RequestScope
	public Data1 d1() {
		return new Data1();
	}
	
	@Bean("request2")
	@RequestScope
	public Data2 d2() {
		return new Data2();
	}
}
