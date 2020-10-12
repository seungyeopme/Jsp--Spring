package lank_d;

import java.util.Scanner;

public class n3 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner s=new Scanner(System.in);
		
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			//System.out.println((i+1)+"번째 숫자 5개 입력: ");
			arr[i]=s.nextInt();
			
			if (i==0) min=arr[i];
			
			if(min>arr[i]) {
				min=arr[i];	
			}
		}
		System.out.println(/*"최소값: "+*/min);
	}
}
