package co.soft.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test2 {
	
	private int data1;
	private String data2;
	private Data4 data3=null;
	private Data5 data4=null;
	
	public Test2(@Value("10") int data1, @Value("문자")String data2, Data4 data3, Data5 data4) {
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
		this.data4=data4;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public Data4 getData3() {
		return data3;
	}

	public void setData3(Data4 data3) {
		this.data3 = data3;
	}

	public Data5 getData4() {
		return data4;
	}

	public void setData4(Data5 data4) {
		this.data4 = data4;
	}
	
}
