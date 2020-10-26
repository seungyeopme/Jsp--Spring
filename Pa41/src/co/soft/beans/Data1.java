package co.soft.beans;

public class Data1 {
	
	private int s1;
	private double s2;
	private boolean s3;
	private String s4;
	
	public Data1(int s1, double s2, boolean s3, String s4) {
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
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
	public String getS4() {
		return s4;
	}
	public void setS4(String s4) {
		this.s4 = s4;
	}
}