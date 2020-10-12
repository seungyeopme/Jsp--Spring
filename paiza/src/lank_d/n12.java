package lank_d;

import java.util.Scanner;

/*
 시간 중 n시 부분이 일을 넘어서 25 시가되어 버린 경우는 1시와하도록 0 시부 터 23 시까 지 24 시간 표기로 
 정확한 수치로 수정하는 프로그램을 작성하십시오.

예를 들어 입력 예 1에서는

32
32시이며, 제대로 다음날 8시이므로

8
출력하십시오.

입력 예 1
32
출력 예 1
8

입력 예 2
47
출력 2
23
 */
public class n12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int h=s.nextInt();
		int result = 0;
		if(h>=24) {
			result = h-24;
			System.out.println(result);
		}
		else {
			System.out.println(h);
		}
	}
}