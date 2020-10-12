package lank_d;

import java.util.Scanner;

/*
 당신은 양의 정수의 곱셈 만하는 계산기 프로그램을 작성하고 있습니다.
그 계산기는 최대 4 자리까지 밖에 지원하지 않고 9,999보다 큰 숫자는 표시하지 못하고 "NG"가 표시됩니다.

2 개의 양의 정수 a, b가 입력되기 때문에 a와 b를 곱했을 때 9,999 이하이면 곱한 결과를 출력하여 10,000 이상의 경우는 
"NG"를 출력하는 프로그램을 작성하십시오 .

입력되는 값
입력은 다음 형식으로 제공됩니다.

a b
입력 한 줄이 끝에 줄 바꿈이 들어갑니다.

입력 예 1
100 20
출력 예 1
2000
입력 예 2
9999 29
출력 2
NG
 */
public class n44 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int result = a*b;
		if(result>10000) {
			System.out.println("NG");
		}
		else {
			System.out.println(result);
		}
	}
}