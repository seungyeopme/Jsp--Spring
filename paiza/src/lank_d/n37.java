package lank_d;

import java.util.Scanner;

/*
 있는 양의 정수 n이 입력됩니다.
양의 정수 1에서 9 정수 n을 각각 곱한 수를 공백으로 구분하여 출력하십시오.


예를 들어 n = 2 인 경우


2 4 6 8 10 12 14 16 18
됩니다

입력되는 값
입력은 다음 형식으로 제공됩니다.
입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

n (양의 정수)

기대하는 출력
양의 정수 n을 1에서 9까지의 수를 곱한 수를 공백으로 구분하여 출력합니다
마지막 개행하고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
4
출력 예 1
4 8 12 16 20 24 28 32 36
입력 예 2
99
출력 2
99 198 297 396 495 594 693 792 891
 */
public class n37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num = s.nextInt();
		int result = 0;
		for(int i=1;i<=9;i++) {
			result = num * i;
			System.out.print(result+" ");
		}
	}
}