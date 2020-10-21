package co.soft.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class Data1 {
	
	@Size(min=2, max=10)
	private String s1;
	
	@Max(100)
	private int s2;

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}
}