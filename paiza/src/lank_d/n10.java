package lank_d;

import java.util.Scanner;

/*
 당신은 수도 시설이 갖추어지지 않은 도시에 살고 있고, 빗물을 저수하고 생활 용수로 사용하고 있습니다.
저수 탱크의 용량과 직전 일주일 분의 하루 강수량의 데이터가 주어지기 때문에 현재 저수 탱크에 얼마나 물이 고여 있거나 구하십시오.
또한 저수조의 물은 처음 일체 물이 들어 가지 않고, 일주일 동안 모으면에서만 사용할 수없는 것으로합니다.

입력 예 1에서는 저수 탱크의 용량은 100에서 일주일 당 강수량의 합이 28이므로 물이 넘치는 않고 28을 출력합니다.


입력되는 값
입력은 다음 형식으로 제공됩니다.

N
A_1
A_2
...
A_7
· 첫 번째 줄에는 저수 탱크의 용량을 나타내는 정수 N이 주어집니다.
· 1 + i 라인 (1 ≦ i ≦ 7)는 i 일째의 강수량을 나타내는 정수 A_i이 주어집니다.
· 입력은 총 8 행이 입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
현재 저수 탱크의 물의 양을 나타내는 정수를 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
100
1
2
3
4
5
6
7
출력 예 1
28

입력 예 2
200
10
20
30
40
50
60
70
출력 2
200
저수 탱크 용량 이상의 물을 모을 수 없다는 점에 유의하십시오.

 */
public class n10 {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner s1=new Scanner(System.in);
		int j= s1.nextInt();
		Scanner s=new Scanner(System.in);
		int[]su= new int[7];
		
		for(int i=0; i<su.length; i++) {
			su[i] = s.nextInt();
		}
		
		for(int i=0; i<su.length; i++) {
			sum=sum+su[i];
		}
		if(sum > j) {
			sum = j;
		}
		System.out.println(sum);
	}
}
