package lank_d;

import java.util.Scanner;

/*
 정수 N과 M이 주어지기 때문에 N을 M으로 나눈 나머지를 출력하십시오.
나눌하고 나머지가 0의 경우도 0으로 출력하십시오.

입력 예 1
10
3
출력 예 1
1
입력 예 2
18
9
출력 2
0
 */
public class n24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result= 0;
		
		result = a%b;
		System.out.println(result);
	}

}
