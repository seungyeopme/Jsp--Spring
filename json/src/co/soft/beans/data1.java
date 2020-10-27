package co.soft.beans;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

public class data1 {

	private String s1;
	private double s2;
	private boolean s3;
	int s4;

	public data1(String s1, double s2, boolean s3, int s4) {
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	this.s4=s4;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public boolean isS3() {
		return s3;
	}

	public void setS3(boolean s3) {
		this.s3 = s3;
	}

	public int getS4() {
		return s4;
	}

	public void setS4(int s4) {
		this.s4 = s4;
	}
}
