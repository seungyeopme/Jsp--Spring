package lank_d;

import java.util.Scanner;

/*
 있는 10 진수의 양의 정수 n이 주어집니다.

n은 무엇 자리를 숫자로 출력합니다.

입력 예 1
100
출력 예 1
3
입력 예 2
4304
출력 2
4

 */
public class n14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int length = (int)(Math.log10(num)+1);
		
		System.out.println(length);

	}

}
