package co.soft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"co.soft.beans", "co.soft.advisor" })
@EnableAspectJAutoProxy
public class BeanConfig {

}
