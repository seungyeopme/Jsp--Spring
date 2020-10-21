package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
//빈 객체 정의하는 클래스
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
@Configuration
public class RootAppContext {
	
	@Bean
	@ApplicationScope
	public Data1 app() {
		return new Data1();
	}
	
	@Bean("app2")
	@ApplicationScope
	public Data2 app2() {
		return new Data2();
	}
}
