package co.soft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test4 {

   @Autowired
   @Qualifier("data1")
   private Data1 data1;
   @Autowired
   @Qualifier("data2")
   private Data2 data2;
   public Data1 getData1() {
      return data1;
   }
   public void setData1(Data1 data1) {
      this.data1 = data1;
   }
   public Data2 getData2() {
      return data2;
   }
   public void setData2(Data2 data2) {
      this.data2 = data2;
   }


}