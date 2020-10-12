package lank_d;

import java.util.Scanner;

/*
 당신은 스위치의 상태를 표시하는 프로그램을 작성하고 있습니다.
그 스위치는 1 번 누르면 "ON"과 "OFF"가 전환됩니다.

스위치의 초기 상태는 "OFF"스위치를 누른 횟수 n이 입력되므로 n 번 스위치가 눌러 진 후 상태를 출력합니다.

입력 예 1
3
출력 예 1
ON
입력 예 2
6
출력 2
OFF
 */
public class n25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		String off = "OFF";
		String on = "ON";
		
		int su = s.nextInt();
		
		if(su%2==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
	}
}