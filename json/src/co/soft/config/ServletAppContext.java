package co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc
// 스캔할 패키지를 지정한다.
@ComponentScan("co.soft.controller")
@ComponentScan("co.soft.service")
@ComponentScan("co.soft.dao")
@PropertySource("/WEB-INF/pro/db.properties")
public class ServletAppContext implements WebMvcConfigurer {

	
	// Controller의 메서드가 반환하는 jsp의 이름 앞뒤에 경로와 확장자를 붙혀주도록 설정한다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

// 정적 파일의 경로를 매핑한다.
	/*
	 * @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 * // TODO Auto-generated method stub
	 * WebMvcConfigurer.super.addResourceHandlers(registry);
	 * registry.addResourceHandler("/**").addResourceLocations("/resources/"); }
	 */

//	@Bean
//	public ReloadableResourceBundleMessageSource messageSource() {
//		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
//		res.setBasenames("/WEB-INF/pro/d1", "/WEB-INF/pro/d2");
//		return res;
//	}

}
