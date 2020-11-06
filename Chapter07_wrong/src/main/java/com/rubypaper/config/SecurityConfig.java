/*암호화 적용하기*/
package com.rubypaper.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BoardUserDetailsService boardUserDetailsService;
	
	@Override
	protected void configure(HttpSecurity security) throws Exception {
		security.authorizeRequests().antMatchers("/").permitAll();
		security.authorizeRequests().antMatchers("/member/**").authenticated();
		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		
		security.csrf().disable();
		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
		security.exceptionHandling().accessDeniedPage("/accessDenied");
		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
		
		security.userDetailsService(boardUserDetailsService);
	}
		@Bean 
		public PasswordEncoder passwordEncoder() {
			return PasswordEncoderFactories.createDelegatingPasswordEncoder();
		}
}


/*사용자 정의 UserDetailsService 적용하기*/
//package com.rubypaper.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private BoardUserDetailsService boardUserDetailsService;
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
//		security.exceptionHandling().accessDeniedPage("/accessDenied");
//		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
//		
//		security.userDetailsService(boardUserDetailsService);
//	}
//}

/*데이터베이스 연동하기*/
/*SecurityConfig 수정*/
//package com.rubypaper.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private DataSource datasource;
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
//		security.exceptionHandling().accessDeniedPage("/accessDenied");
//		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
//	}
//	
//	@Autowired
//	public void authenticate(AuthenticationManagerBuilder auth) throws Exception {
//		String query1 = "select id username, concat('{noop}', password) password, true enabled from member where id=?";
//		String query2 = "select id, role from member where id=?";
//		
//		auth.jdbcAuthentication()
//		.dataSource(datasource)
//		.usersByUsernameQuery(query1)
//		.authoritiesByUsernameQuery(query2);
//	}		
//}

/*접근 권한 없음 페이지 처리*/
//package com.rubypaper.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
//		security.exceptionHandling().accessDeniedPage("/accessDenied");
//		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
//	}
//	
//	@Autowired
//	public void authenticate(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().
//		withUser("manager").
//		password("{noop}manager123").
//		roles("MANAGER");
//		
//		auth.inMemoryAuthentication().
//		withUser("admin").
//		password("{noop}admin123").
//		roles("ADMIN");
//	}
//}

/*메모리 사용자 인증하기*/
//package com.rubypaper.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
//	}
//	
//	@Autowired
//	public void authenticate(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().
//		withUser("manager").
//		password("{noop}manager123").
//		roles("MANAGER");
//		
//		auth.inMemoryAuthentication().
//		withUser("admin").
//		password("{noop}admin123").
//		roles("ADMIN");
//	}
//}

/*loginPage() 메소드 추가*/
//package com.rubypaper.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
//	}
//}

/*사용자 인증하기*/
//package com.rubypaper.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//		security.formLogin();
//	}
//}

/*시큐리티 재정의*/
//package com.rubypaper.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//		
//		security.csrf().disable();
//	}
//}

//package com.rubypaper.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity security) throws Exception {
//	}
//}