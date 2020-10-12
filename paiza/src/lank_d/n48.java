package lank_d;

import java.util.Scanner;

/*
 오늘 폭설, 아이들은 가마쿠라를 만들려고 들떠 있습니다. 얼마나 많은 부피의 눈이 필요한지를 계산하고 줍시다.

가마쿠라는 1 변이 r1 (m)의 입방체에서 r2 (m)의 입방체 분을 속을 비게 형태로 만듭니다 (아래 그림 참조). 
이 때 가마쿠라의 체적 (m ^ 3)은


r1 ^ 3 - r2 ^ 3

에서 구할 수 있습니다.

예)

r1 = 5, r2 = 2

→ 가마쿠라의 부피 = 5 ^ 3 - 2 ^ 3 = 125 - 8 = 117 m ^ 3


입력되는 값
입력은 다음 형식으로 제공됩니다.

r_1 r_2
눈사람을 구성하는 입방체의 한 변의 길이 (m)를 나타내는 정수 r_1, r_2가 공백으로 구분하여 부여됩니다.

입력 한 줄이되어, 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
쿠라을 만드는데 필요한 눈의 체적 (m ^ 3)을 출력합니다.

출력의 끝에 줄 바꿈을 하나 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
5 2
출력 예 1
117
입력 예 2
6 4
출력 2
152
입력 예 3
2 1
출력 3
7
 */
public class n48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		int result = 0;
		
		result = num1 * num1 * num1 - num2 * num2 * num2 ;
		System.out.println(result);
	}
}