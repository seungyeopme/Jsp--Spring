package co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.soft.beans.Test1;
import co.soft.beans.Test2;
import co.soft.beans.Test3;
import co.soft.beans.Test4;
import co.soft.beans.Test5;
import co.soft.beans.Test6;
import co.soft.config.Config;

public class MainClass {
   public static void main(String[] args) {

      // ClassPathXmlApplicationContext ctx = new
      // ClassPathXmlApplicationContext("co/soft/config/beans.xml");

      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

      Test1 obj1 = ctx.getBean("obj1", Test1.class);
      Test2 obj2 = ctx.getBean("obj2", Test2.class);
      System.out.println("-----------------------------------------------1");

      Test3 obj3 = ctx.getBean("obj3", Test3.class);
      System.out.println(obj3.getData1());
      System.out.println(obj3.getData2());
      System.out.println("-----------------------------------------------2");
      
      Test4 obj4 = ctx.getBean("obj4", Test4.class);
      System.out.println(obj4.getData1());
      System.out.println(obj4.getData2());
      System.out.println("-----------------------------------------------3");
      
      Test5 obj5 = ctx.getBean("obj5", Test5.class);
      System.out.println(obj5.getData1());
      System.out.println(obj5.getData2());
      System.out.println("-----------------------------------------------4");
      
      Test6 obj6 = ctx.getBean("obj6", Test6.class);
      System.out.println(obj6.getData10());
      System.out.println(obj6.getData20());

      ctx.close();
   }
}