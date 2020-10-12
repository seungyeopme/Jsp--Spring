package lank_d;

import java.util.Scanner;

/*
 양의 정수 N이 입력되므로, N이 홀수이면 "odd"짝수이면 "even"라고 출력하는 프로그램을 작성하십시오.
입력 예 1
4
출력 예 1
even
입력 예 2
5
출력 2
odd
입력 예 3
2
출력 3
even
 */
public class n30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num= s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}