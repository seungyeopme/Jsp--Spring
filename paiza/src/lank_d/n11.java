package lank_d;

import java.util.Scanner;

/*
 있는 양의 정수 n이 입력됩니다.

n 분 초로 변환하는 프로그램을 작성하십시오.

예를 들어 다음과 같은 입력의 경우
16
60을 곱한
960
출력하십시오.

입력 예 1
16
출력 예 1
960

입력 예 2
3
출력 2
180
 */
public class n11 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int num =s.nextInt();
		
		int result=num*60;
		System.out.println(result);
	}
}