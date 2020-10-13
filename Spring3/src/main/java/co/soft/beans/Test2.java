package co.soft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test2 {
   public Test2() {
      System.out.println("test2");
   }

   @PostConstruct
   public void init2() {
      System.out.println("test2_init2");
   }

   @PreDestroy
   public void destroy2() {
      System.out.println("test2_destroy2");
   }
}