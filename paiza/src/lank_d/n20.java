package lank_d;

import java.util.Scanner;

/*
 -100에서 100까지의 정수 n이 주어 지므로 절대 값을 출력하십시오.

예
-10
입력 된 경우

10
출력하십시오.

입력 예 1
-1
출력 예 1
1
입력 예 2
15
출력 2
15
 */
public class n20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int num = s.nextInt();
		System.out.println(Math.abs(num));

	}
}
