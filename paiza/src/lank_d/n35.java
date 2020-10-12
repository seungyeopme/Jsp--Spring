package lank_d;

import java.util.Scanner;

/*
 당신은 A 버튼, B 버튼 두 버튼을 사용 게임을 만들고 있습니다.

이 게임에서는 캐릭터를 움직여 놉니다. 캐릭터는 시작 좌표 0의 위치에 있고, A 버튼을 누르면 캐릭터가 1 칸 오른쪽으로 이동 
(좌표가 1 증가), B 버튼을 누르면 캐릭터가 1 칸 왼쪽으로 이동 (좌표가 1 감소)입니다 .

A, B 버튼 각각 몇번 눌렀지만 입력되므로 버튼을 모두 눌러 진 후 캐릭터의 위치 좌표를 출력하는 프로그램을 작성하십시오.

입력되는 값
입력은 다음 형식으로 제공됩니다.

a b

A, B 버튼을 누른 횟수가 A 버튼, B 버튼을 차례로 공백으로 구분하여 부여됩니다. 
입력 한 줄이되어, 끝에 줄 바꿈이 하나 들어갑니다.

입력 예 1
3 4
출력 예 1
-1
입력 예 2
80 44
출력 2
36

 */
public class n35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int result = 0;
		result = a - b;
		System.out.print(result);
	}
}
