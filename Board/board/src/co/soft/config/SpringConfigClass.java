package co.soft.config;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//public class SpringConfigClass implements WebApplicationInitializer{
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		// Spring MVC �봽濡쒖젥�듃 �꽕�젙�쓣 �쐞�빐 �옉�꽦�븯�뒗 �겢�옒�뒪�쓽 媛앹껜瑜� �깮�꽦�븳�떎.
//		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
//		servletAppContext.register(ServletAppContext.class);
//		
//		// �슂泥� 諛쒖깮 �떆 �슂泥��쓣 泥섎━�븯�뒗 �꽌釉붾┸�쓣 DispatcherServlet�쑝濡� �꽕�젙�빐以��떎.
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
//		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
//		
//		// 遺�媛� �꽕�젙
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//		
//		// Bean�쓣 �젙�쓽�븯�뒗 �겢�옒�뒪瑜� 吏��젙�븳�떎
//		AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
//		rootAppContext.register(RootAppContext.class);
//		
//		ContextLoaderListener listener = new ContextLoaderListener(rootAppContext);
//		servletContext.addListener(listener);
//		
//		// �뙆�씪誘명꽣 �씤肄붾뵫 �꽕�젙
//		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
//		filter.setInitParameter("encoding", "UTF-8");
//		filter.addMappingForServletNames(null, false, "dispatcher");
//	}
//}

public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer{
	// DispatcherServlet�뿉 留ㅽ븨�븷 �슂泥� 二쇱냼瑜� �뀑�똿�븳�떎.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	// Spring MVC �봽濡쒖젥�듃 �꽕�젙�쓣 �쐞�븳 �겢�옒�뒪瑜� 吏��젙�븳�떎.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletAppContext.class};
	}
	
	// �봽濡쒖젥�듃�뿉�꽌 �궗�슜�븷 Bean�뱾�쓣 �젙�쓽湲� �쐞�븳 �겢�옒�뒪瑜� 吏��젙�븳�떎.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppContext.class};
	}
	
	// �뙆�씪誘명꽣 �씤肄붾뵫 �븘�꽣 �꽕�젙
	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		// TODO Auto-generated method stub
		super.customizeRegistration(registration);
		
		MultipartConfigElement config1 = new MultipartConfigElement(null, 52428800, 524288000, 0);
		registration.setMultipartConfig(config1);
	}
}

















