package co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test1;
import co.soft.beans.Test2;
import co.soft.beans.Test3;
import co.soft.beans.Test4;
import co.soft.beans.Test5;
import co.soft.config.Config;

public class MainClass {
   public static void main(String[] args) {

	  AnnotationConfigApplicationContext ctx2 =
	    		  new AnnotationConfigApplicationContext(Config.class);
      Test1 x1 = ctx2.getBean(Test1.class);
      System.out.println(x1);
      
      Test1 x2 = ctx2.getBean(Test1.class);
      System.out.println(x2);
      
      System.out.println("==========================");
      Test2 x3 = ctx2.getBean("t3", Test2.class);
      System.out.println(x3);
      
      Test2 x4 = ctx2.getBean("t3", Test2.class);
      System.out.println(x4);
      
      Test2 x5 = ctx2.getBean("t5", Test2.class);
      System.out.println(x5);
      
      Test2 x6 = ctx2.getBean("t6", Test2.class);
      System.out.println(x6);
   
      System.out.println("==========================");
      
      Test3 x7 = ctx2.getBean(Test3.class);
      System.out.println(x7);
      
      Test3 x8 = ctx2.getBean(Test3.class);
      System.out.println(x8);
      System.out.println("==========================");
      
      Test4 x9 = ctx2.getBean(Test4.class);
      System.out.println(x9);
      
      Test4 x10 = ctx2.getBean(Test4.class);
      System.out.println(x10);
      
      Test5 x11 = ctx2.getBean(Test5.class);
      System.out.println(x11);
   }
}