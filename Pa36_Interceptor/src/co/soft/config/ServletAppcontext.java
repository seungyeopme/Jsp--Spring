package co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.soft.val.Inter1;

@Configuration
@EnableWebMvc
@ComponentScan("co.soft.controller")
public class ServletAppcontext implements WebMvcConfigurer{

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
	//properties파일을 message로 등록한다.
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
		
		res.setBasenames("/WEB-INF/pro/d1","/WEB-INF/pro/d2");
		return res;
	}
	//인터셉터 등록
	public void addInterceptors(InterceptorRegistry re) {
		
		WebMvcConfigurer.super.addInterceptors(re);
		
		Inter1 i1 = new Inter1();
		
		InterceptorRegistration r1 = re.addInterceptor(i1);
		
		//addPathPatterns: Interceptor가 가로채 갈 주소를 등록한다.
		//excludePathPatterns: Interceptor가 가로채 가지 않을 주소를 등록한다.
		r1.addPathPatterns("/input");
	}
}









