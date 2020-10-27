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

// Spring MVC ������Ʈ�� ���õ� ������ �ϴ� Ŭ����
@Configuration
// Controller ������̼��� ���õǾ� �ִ� Ŭ������ Controller�� ����Ѵ�.
@EnableWebMvc
// ��ĵ�� ��Ű���� �����Ѵ�.
@ComponentScan("co.soft.controller")
@ComponentScan("co.soft.service")
@ComponentScan("co.soft.dao")
@PropertySource("/WEB-INF/pro/db.properties")
public class ServletAppContext implements WebMvcConfigurer {

	
	// Controller�� �޼��尡 ��ȯ�ϴ� jsp�� �̸� �յڿ� ��ο� Ȯ���ڸ� �����ֵ��� �����Ѵ�.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

// ���� ������ ��θ� �����Ѵ�.
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
