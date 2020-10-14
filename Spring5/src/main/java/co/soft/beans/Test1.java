package co.soft.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test1 {
	@Autowired
	private Data1 data1;
	
	@Autowired
	@Qualifier("ob2") //자동 주입을 하는데 ob2에 주겠다.
	private Data2 data2;
	
	@Resource(name="ob3") //obj3에 주입하겠다.
	private Data3 data3;
	
	@Resource(name ="ob4")
	private Data3 data4;
	
	@Resource(name ="ob5")
	private Data3 data5;

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

	public Data3 getData3() {
		return data3;
	}

	public void setData3(Data3 data3) {
		this.data3 = data3;
	}

	public Data3 getData4() {
		return data4;
	}

	public void setData4(Data3 data4) {
		this.data4 = data4;
	}

	public Data3 getData5() {
		return data5;
	}

	public void setData5(Data3 data5) {
		this.data5 = data5;
	}
	
}