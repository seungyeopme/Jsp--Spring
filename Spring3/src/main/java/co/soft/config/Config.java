package co.soft.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import co.soft.beans.Data1;
import co.soft.beans.Data2;
import co.soft.beans.Test1;
import co.soft.beans.Test2;
import co.soft.beans.Test3;
import co.soft.beans.Test4;
import co.soft.beans.Test5;
import co.soft.beans.Test6;

@Configuration
public class Config {

   @Bean(initMethod = "init1", destroyMethod = "destroy1")
   @Lazy
   public Test1 obj1() {
      return new Test1();
   }

   @Bean
   @Lazy
   public Test2 obj2() {
      return new Test2();
   }

   // 밑에 @Bean 두개 있어야함
   @Bean
   public Data1 data1() {
      return new Data1();
   }

   @Bean
   public Data2 data2() {
      return new Data2();
   }

   @Bean(autowire = Autowire.BY_NAME)
   public Test3 obj3() {
      return new Test3();
   }

   @Bean
   public Test4 obj4() {
      return new Test4();
   }

   @Bean
   public Test5 obj5() {
      return new Test5();
   }

   @Bean
   public Test6 obj6() {
      return new Test6();
   }

}