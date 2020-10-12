package lank_d;

import java.util.Scanner;

/*
 당신의 회사는 요즘 유행하는 재택 근무를 도입하고 화상 통화를 이용해 회의를하기로했습니다.

모두의 얼굴을 화면에 비추면서 회의를하려고 생각 당신은 화면을 N × N의 사각형으로 분할하고, 
그 틀 하나 당 한 명의 얼굴이 비치 게했다.
화면 분할 수를 나타내는 정수 N과 화상 회의에 현재 참석하는 인원 M이 주어 지므로 앞으로 몇 명의 화상 회의에 참여할 수 있는지 물어 
프로그램을 작성하십시오.

예를 들어, 입력 예 1에서는 화면을 4 × 4로 분할 3 명 출석하고 있기 때문에, 4 × 4 - 3 = 13보다 13를 출력합니다.

입력은 다음 형식으로 제공됩니다.

N
M
· 첫 번째 줄은 화면의 분할 수를 나타내는 정수 N이 주어집니다.
· 두 번째 줄에는 현재 회의에 참석하는 인원을 나타내는 정수 M이 주어집니다.
· 입력은 총 2 행이 입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
화상 회의에 앞으로 몇 명 참석할 수 있는지를 정수로 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
4
3
출력 예 1
13
입력 예 2
3
0
출력 2
9
 */
public class n41 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int result = 0;
		
		result = num1 * num1 - num2;
		System.out.println(result);
	}
}