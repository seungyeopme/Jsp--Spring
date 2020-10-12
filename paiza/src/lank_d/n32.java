package lank_d;

import java.util.Scanner;

/*
 Paiza 군이 참여하는 코딩 대회에서 코드의 정확성, 실행 시간, 예쁨 세 가지 항목이 각각 10 점 만점으로 평가하고 
 그 합계 점수가 점수입니다.

Paiza 군 경연 결과, 정확성, 실행 시간 청소의 세 가지로 주어지기 때문에 자신의 점수를 출력합니다.

그러나 각 항목의 점수는 0 이상의 정수입니다.
입력 예 1
8 7 9
출력 예 1
24
입력 예 2
10 10 0
출력 2
20
 */
public class n32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int[] num = new int[3];
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			num[i]=s.nextInt();
			sum += num[i];
		}
		System.out.println(sum);
	}
}