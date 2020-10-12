package lank_d;

import java.util.Scanner;

/*
 당신은 어떤 과자를 가지고 있고,이 과자를 2 명의 자녀가 절반 씩分け与えよ노력하고 있습니다.
개수가 짝수이면 반씩 나눌 수 있습니다. 그러나 홀수이면 그냥 절반은 할 수 없기 때문에 하나를 스스로 먹고 나머지를 자녀에게 주기로합니다.

과자의 개수가 주어지기 때문에 아이는 몇 개씩 사탕을받을 수 있는지 출력합니다.

입력은 다음 형식으로 제공됩니다.

N

과자의 개수를 나타내는 정수 N이 1 행에 입력됩니다.
· 입력은 한 줄이되어, 끝에 줄 바꿈을 하나 포함합니다.

기대하는 출력
아이들이 무엇 개씩 사탕을받을 수 또는 정수로 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
20
출력 예 1
10
입력 예 2
25
출력 2
12
 */
public class n46 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num =s.nextInt();
		
		if(num%2==0) {
			System.out.println(num/2);
		}
		else {
			num = num-1;
			System.out.println(num/2);
		}
	}
}