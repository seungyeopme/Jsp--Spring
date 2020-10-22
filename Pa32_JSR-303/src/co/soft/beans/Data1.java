package co.soft.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Data1 {
	
	@AssertTrue
	private boolean s1;
	
	@AssertFalse
	private boolean s2;
	
	@Max(100)
	@Min(10)
	private String s3;
	
	@DecimalMax(value="100", inclusive=false)
	@DecimalMin(value="10", inclusive=false)
	private String s4;
	
	@Null
	private String s5;
	
	@NotNull
	private String s6;
	
	@Size(min=2, max=10)
	private String s7;
	
	@Digits(integer=3, fraction=3)
	private String s8;
	
	@Pattern(regexp="[a-zA-Z]*")
	private String s9;
	
	public Data1() {
		this.s1=true;
		this.s2=false;
		this.s3="40";
		this.s4="40";
		this.s5=null;
		this.s6="aa";
		this.s7="abcde";
		this.s8="333.333";
	}
	
	public boolean isS1() {
		return s1;
	}

	public void setS1(boolean s1) {
		this.s1 = s1;
	}

	public boolean isS2() {
		return s2;
	}

	public void setS2(boolean s2) {
		this.s2 = s2;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getS4() {
		return s4;
	}

	public void setS4(String s4) {
		this.s4 = s4;
	}

	public String getS5() {
		return s5;
	}

	public void setS5(String s5) {
		this.s5 = s5;
	}

	public String getS6() {
		return s6;
	}

	public void setS6(String s6) {
		this.s6 = s6;
	}

	public String getS7() {
		return s7;
	}

	public void setS7(String s7) {
		this.s7 = s7;
	}

	public String getS8() {
		return s8;
	}

	public void setS8(String s8) {
		this.s8 = s8;
	}

	public String getS9() {
		return s9;
	}

	public void setS9(String s9) {
		this.s9 = s9;
	}
}