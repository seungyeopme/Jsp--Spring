package lank_d;

import java.util.Scanner;

/*
 있는 양의 정수 a와 b가 공백으로 구분하여 입력됩니다.

a와 b를 비교하여 큰 값을 출력하십시오. a와 b가 같은 경우 "eq"고 출력하십시오.

입력되는 값
양의 정수 a와 b가 공백으로 구분 된 문자열 한 줄에 입력됩니다.
입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

a (양의 정수) b (양의 정수)

기대하는 출력
표준 출력에 숫자로만 a와 b의 값 중 큰 값을 출력합니다. a와 b가 같은 값의 경우는 반각 소문자 알파벳에서 "eq"라고 출력합니다.
마지막 개행하고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
10 20
출력 예 1
20
입력 예 2
3 3
출력 2
eq

 */
public class n38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a<b) {
			System.out.println(b);
		}
		else if(a==b) {
			System.out.println("eq");
		}
	}
}