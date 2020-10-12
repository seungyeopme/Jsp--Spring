package lank_d;

import java.util.Scanner;

/*
 양의 정수 N은 표준 입력으로부터 입력되므로, N 개의 '*'를 연결 한 문자열을 출력하는 프로그램을 작성하자.

예를 들어 N = 3의 경우
***
같이 출력합니다.

입력 예 1
4
출력 예 1
****
입력 예 2
6
출력 2
******
입력 예 3
2
출력 3
**
 */
public class n33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		char star = '*';
		
		for(int i=0; i<num; i++) {
			System.out.print(star);
		}
	}
}
