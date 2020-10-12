package lank_d;

import java.util.Scanner;

/*
쌀의 무게 단위로 경우라는 것이 있습니다. 1 홉은 대략 150 g으로되어 있습니다.

1 홉 당 150 g으로 N 경우 쌀이있을 때 무엇 g되는지를 출력합니다. 

입력되는 값
입력은 다음 형식으로 제공됩니다.

N
· 첫 번째 줄에 쌀의 양 N 경우가 부여됩니다
· 입력은 총 1 행이 입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
1 홉 당 150 g으로 N 경우 쌀이있을 때 무엇 g되는지를 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
3
출력 예 1
450
입력 예 2
1
출력 2
150
 */
public class n49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;
		
		result = n * 150;
		System.out.println(result);

	}
}