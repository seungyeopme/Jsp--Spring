package lank_d;

import java.util.Scanner;

/*
 당신은 상자에 들어간 과자를 가족 N 사람으로 분할하기로 결정했습니다.

상자는 세로로 H 개, 옆에 W 개의 총 H × W 개의 과자가 들어 있습니다 만, 
N 사람 균등하게 과자를 나눠 경우 이렇게이 발생할 수 있습니다.

N 사람 균등하게 많은 나눈 후 지나친 과자를 출력합니다.

입력되는 값
입력은 다음 형식으로 제공됩니다.

N
H W
· 1 번째 줄에는 가족 수를 나타내는 정수 N이 입력됩니다.

· 두 번째 줄에는 상자에 들어있는 과자의 세로 몇 H, 옆의 수 W가이 순서로 공백으로 구분하여 입력됩니다.

· 입력은 1 행이 끝에 줄 바꿈이 들어갑니다.

기대하는 출력
N 사람 균등하게 많은 나눈 후 나머지를 정수로 출력합니다. 나머지가없는 경우는 0을 출력합니다.
끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
3
5 5
출력 예 1
1
입력 예 2
7
10 20
출력 2
4
 */
public class n29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int result = 0;
		int div = s.nextInt();
		int su1 = s.nextInt();
		int su2 = s.nextInt();
		
		result = (su1 * su2) % div;
		
		System.out.println(result);
	}
}