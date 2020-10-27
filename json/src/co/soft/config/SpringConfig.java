package co.soft.config;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*public class SpringConfigClass implements WebApplicationInitializer{

   @Override
   //Spring MVC ������Ʈ ������ ���� Ŭ������ ��ü �����Ѵ�.
  
   public void onStartup(ServletContext servletContext) throws ServletException {
      
      AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
      servletAppContext.register(ServletAppContext.class);
  
      //��û�� ó���ϴ� ������ DispatcherServlet���� �������ش�.
      DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
      ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
      
      //1°�� �ε���
      servlet.setLoadOnStartup(1);
      servlet.addMapping("/");
      
   //Bean �����ϴ� Ŭ������ �����Ѵ�.
      AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
      rootAppContext.register(RootAppContext.class);
      
      ContextLoaderListener listener = new ContextLoaderListener(rootAppContext);
      servletContext.addListener(listener);
      
      FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
      filter.setInitParameter("encoding", "UTF-8");
      filter.addMappingForServletNames(null, false, "dispatcher");
   }
}
*/
public class SpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
   //�����ļ����� ��Ī�� ��û �ּҸ� �����Ѵ�.
	
   @Override
   protected String[] getServletMappings() {
      // TODO Auto-generated method stub
      return new String[] {"/"};
      //����û�ּҿ����� ����
   }
   
   
   @Override
   protected Class<?>[] getServletConfigClasses() {
      // TODO Auto-generated method stub
      return new Class[] {ServletAppContext.class};
   }
   

   @Override
   protected Class<?>[] getRootConfigClasses() {
      // TODO Auto-generated method stub
      return new Class[] {RootAppContext.class};
   }

   @Override
   protected Filter[] getServletFilters() {
      // TODO Auto-generated method stub
      CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
      encodingFilter.setEncoding("UTF-8");
      return new Filter[] {encodingFilter};
   }
}