package lank_d;

import java.util.Scanner;

public class n4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String a=s.next();
		String b=s.next();
		
		if(a.equals(b)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}
