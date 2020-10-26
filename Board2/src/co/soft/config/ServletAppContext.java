package co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.soft.interceptor.topinterceptor;
import co.soft.mapper.BoardMapper;
import co.soft.mapper.topmapper;
import co.soft.service.topservice;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc

// 스캔할 패키지를 지정한다.
@ComponentScan("co.soft.controller")
@ComponentScan("co.soft.dao")
@ComponentScan("co.soft.service")

@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	
	@Autowired
	private topservice tservice;
		
	@Bean
	public BasicDataSource data() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);
		
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
	public MapperFactoryBean<BoardMapper> mapper(SqlSessionFactory factory) {
		
		MapperFactoryBean<BoardMapper> fac = new MapperFactoryBean<BoardMapper>(BoardMapper.class);
		fac.setSqlSessionFactory(factory);
		
		return fac;
	}
	@Bean
	public MapperFactoryBean<topmapper> map(SqlSessionFactory factory) {
		
		MapperFactoryBean<topmapper> fac = 
				new MapperFactoryBean<topmapper>(topmapper.class);
		fac.setSqlSessionFactory(factory);
		
		return fac;
	}
	public void addInterceptors(InterceptorRegistry registry) {
		
		WebMvcConfigurer.super.addInterceptors(registry);
		topinterceptor topinter = new topinterceptor(tservice);
		InterceptorRegistration r1 = registry.addInterceptor(topinter);
		r1.addPathPatterns("/**");
	}
	
	// Controller의 메서드가 반환하는 jsp의 이름 앞뒤에 경로와 확장자를 붙혀주도록 설정한다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	// 정적 파일의 경로를 매핑한다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	//메시지 등록
	@Bean
	public ReloadableResourceBundleMessageSource me() {
		ReloadableResourceBundleMessageSource res = 
				new ReloadableResourceBundleMessageSource();
		res.setBasename("/WEB-INF/properties/error");
		
		return res;
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer pr() {
		return new PropertyPlaceholderConfigurer();
	}
}