package co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.soft.beans.Test1;
import co.soft.beans.Test2;
import co.soft.beans.Test3;
import co.soft.config.Config;

public class MainClass {
   public static void main(String[] args) {

	  AnnotationConfigApplicationContext ctx2 =
	    		  new AnnotationConfigApplicationContext(Config.class);
      
	  Test1 x1 = ctx2.getBean(Test1.class);
      System.out.println(x1.getData1());
      System.out.println(x1.getData2());
      System.out.println(x1.getData3());
      System.out.println(x1.getData4());
      System.out.println(x1.getData5());
      
      System.out.println("-----------------------");
      
      Test2 t2 = ctx2.getBean(Test2.class);
      System.out.println(t2.getData1());
      System.out.println(t2.getData2());
      System.out.println(t2.getData3());
      System.out.println(t2.getData4());
      
      Test3 test2 = ctx2.getBean("test20",Test3.class);
      System.out.println(test2.getData1());
      System.out.println(test2.getData2());
      System.out.println(test2.getData3());
      System.out.println(test2.getData4());
   }
}