package lank_d;

import java.util.Scanner;

/*
 당신은 주스를 N 밀리리터 손에 넣었습니다.
그 주스를 M 밀리리터 들어갈 컵으로 분류된다했습니다.

N, M의 순서로 줄 바꿈으로 구분 값이 주어지기 때문에 몇 컵에 나눌 수 있을지를 구하십시오.

그러나 남은 주스는 자신 몰래 마셔 버리므로 나눈 수에 포함하지 않기로합니다.

예를 들어 다음과 같은 입력하면

500
180
500 밀리리터의 주스를 180 밀리리터 들어갈 컵에 나누는 때문에
2 개의 컵에 나눌 수 140 밀리리터 넘치는 때문에 다음과 같이 출력하십시오

2

입력되는 값
입력은 다음 형식으로 제공됩니다.

N
M
· 첫 번째 줄에 손에 넣은 주스의 양 N 밀리리터

· 두 번째 줄에 나누는 데 사용하는 컵의 용량 M 밀리리터

· 입력은 두 줄이 끝에 줄 바꿈을 하나 포함합니다.
 기대하는 출력
주스를 N 밀리리터를 M 밀리리터 들어갈 컵 몇으로 나누어되는지를 출력합니다.
그러나 남은 주스 나눈 수에 포함하지 않기로합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
500
180
출력 예 1
2
입력 예 2
295
295
출력 2
1
 */
public class n39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result = 0;
		
		result = a / b;
		System.out.println(result);

	}

}
