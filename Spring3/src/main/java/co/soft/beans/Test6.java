package co.soft.beans;

import javax.annotation.Resource;

public class Test6 {

   @Resource(name = "data1")
   private Data1 data10;
   @Resource(name = "data2")
   private Data2 data20;

   public Data1 getData10() {
      return data10;
   }

   public void setData10(Data1 data10) {
      this.data10 = data10;
   }

   public Data2 getData20() {
      return data20;
   }

   public void setData20(Data2 data20) {
      this.data20 = data20;
   }

}