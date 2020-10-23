package co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
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

import co.soft.dao.Mapping;

@Configuration
@EnableWebMvc
@ComponentScan("co.soft.controller")

@PropertySource("/WEB-INF/pro/db.properties")

public class ServletAppcontext implements WebMvcConfigurer{
	
	@Value("${db.classname}")
	private String classname;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	//데이터베이스 정보 관리해야함
	@Bean
	public BasicDataSource data() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(classname);
		source.setUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		
		return source;
	}
	
	//쿼리문과 접속 관리
	@Bean
	public SqlSessionFactory fac(BasicDataSource source) throws Exception {
		
		SqlSessionFactoryBean facbean = new SqlSessionFactoryBean();
		facbean.setDataSource(source);
		SqlSessionFactory fac = facbean.getObject();
		return fac;
	}
	
	//쿼리문 실행
	@Bean
	public MapperFactoryBean<Mapping> mapper(SqlSessionFactory factory) {
		
		MapperFactoryBean<Mapping> fac = new MapperFactoryBean<Mapping>(Mapping.class);
		fac.setSqlSessionFactory(factory);
		
		return fac;
	}
	
	//properties파일을 message로 등록한다.
	/*(
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
		
		res.setBasenames("/WEB-INF/pro/db");
		return res;
	}
	*/
}