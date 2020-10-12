package lank_d;

import java.util.Scanner;

/*
 있는 2 이상의 정수 n이 주어집니다.

1부터 n까지 1 씩 증가하는 수열의 합을 출력합니다.

예를 들어 다음과 같은 입력의 경우
10
수열은 다음과 같습니다
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
다음과 같이 출력하십시오
55

입력되는 값
입력은 다음 형식으로 제공됩니다.

n

입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
1부터 n까지 1 씩 증가하는 수열의 합을 출력합니다.

마지막 개행하고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
10
출력 예 1
55
입력 예 2
99
출력 2
4950
 */
public class n43 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}