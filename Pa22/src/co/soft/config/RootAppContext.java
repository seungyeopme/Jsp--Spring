package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//빈 객체 정의하는 클래스
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
@Configuration
public class RootAppContext {
	
	@Bean
	@SessionScope //세션 범위; 브라우저 당 하나; 브라우저 종료 될 때까지 서버에서 사용 가능
	public Data1 d1() {
		return new Data1();
	}
}
