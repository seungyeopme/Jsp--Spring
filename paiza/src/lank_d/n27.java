package lank_d;

import java.util.Scanner;

/*
 두 서기 a, b가 공백으로 구분 된 정수로 입력됩니다.

a ~ b가 몇 년인지 출력합니다.

예
1990 2014
입력 된 경우
24
출력하십시오.

입력 예 1
1999 2000
출력 예 1
1
입력 예 2
794 1192
출력 2
398
 */
public class n27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int result = 0;
		int a=s.nextInt();
		int b=s.nextInt();
		
		result = b - a;
		System.out.println(result);	
	}
}