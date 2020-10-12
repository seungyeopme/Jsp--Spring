package lank_d;

import java.util.Scanner;

/*
 당신은 책을 읽고 있었는데, 나머지 몇 페이지인지 알고 싶어졌습니다.


책의 총 페이지 수 m으로 읽은 페이지 n이 입력되므로 남은 페이지 수를 표시합니다.
입력 예 1
30 10
출력 예 1
20
입력 예 2
58 24
출력 2
34
 */
public class n19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(a - b);

	}

}
