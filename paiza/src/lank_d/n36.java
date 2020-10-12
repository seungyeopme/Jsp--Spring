package lank_d;

import java.util.Scanner;

/*
 짝수와 홀수 어느 쪽이 좋아하지만?

당신은 회사를 대표하여 2 개의 숫자를 선택하지 않으면 안됩니다 만, 짝수 좋아 홀수를 좋아하는 홈이 깊어지지 않도록 각각 하나씩 선택하지 않으면 안됩니다.

후보로 거론 된 2 개의 숫자가 입력되므로 짝수와 홀수가 모두 켜져 있는지 확인하십시오.

입력은 다음 형식으로 제공됩니다.

N M
· 후보가 두 개의 정수 N, M이 공백으로 구분하여 입력됩니다.

· 입력은 한 줄이되어, 끝에 줄 바꿈을 하나 포함합니다.

N, M 두 숫자가 짝수와 홀수 쌍이면 "YES", 그렇지 않으면 "NO"를 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
30 15
출력 예 1
YES
입력 예 2
12 40
출력 2
NO
 */
public class n36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		if((a%2==0)&&(b%2==0)) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}