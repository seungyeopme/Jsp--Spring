package lank_c;

import java.util.Scanner;
/*
public class n2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int money=s.nextInt();
		int num=s.nextInt();
		double sum=0;
		int ary[]=new int[num];
		double point[]=new double[num];
		
		for(int i=0;i<num;i++) {
			ary[i]=s.nextInt();
		}
		for(int i=0;i<num;i++) {
			money=money-ary[i];
			System.out.println(money);
			point[i]=ary[i]*0.1;
			System.out.println(point[i]);
			sum = sum+point[i];
		}
		System.out.println(sum);
	}
}
 */
/*
 paiza시에 살고있는 당신은 평소의 이동 수단은 모든 paiza 버스를 사용합니다. 
 paiza 버스에서 paica는 IC 카드를 승차권으로 사용할 수 있습니다. 
 사전에 paica에 충전을하여 사용할 수 있습니다.

버스 요금 지불에 paica 카드 잔액을 사용하면 운임의 10 %가 paica 포인트로 적립됩니다.

버스 하차시 지불 운임 이상의 포인트가 있다면 포인트가 우선적으로 운임의 지불에 사용됩니다. 
그러나 1 포인트는 1 엔이됩니다. 그러나 지점에서 요금을 지불하면 새로운 포인트가 발생하지 않습니다.

당신은 카드 잔액 및 포인트를 얼마나 사용했는지 알기 위해 프로그램을 쓰기로했습니다.

당신이 먼저 충전 현금과 버스를 이용했을 때 걸린 요금의 목록이 주어지기 때문에 
매번 내릴 때 남아있는 돈과 포인트를 출력합니다.

그러나 도중에 카드 잔액 및 포인트 모두가 운임을 밑도는 것은 아닙니다.

입력 예 1은 다음과 같습니다.

입력은 다음 형식으로 제공됩니다.

N M
f_1
f_2
...
f_M
· 1 번째 줄에는 각각 소개 충전 된 금액 버스 승차 횟수를 나타내는 정수 N, M이
이 순서로 공백으로 구분하여 부여됩니다.
· 계속 M 라인 중 i 번째 줄 (1 ≦ i ≦ M)는 i 번째 내릴 때 걸린 운임을 나타내는 정수 f_i가이 순서로 
   공백으로 구분하여 부여됩니다.
· 입력은 총 M + 1 행이 입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

입력 예 1
2000 5
300
500
300
100
100
출력 예 1
1700 30
1200 80
900 110
900 10
800 20

입력 예 2
3000 3
1000
1000
1000
출력 2
2000 100
1000 200
0    300
*/
public class n2 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			
			int a1 = s.nextInt();
			int a2 = s.nextInt();
			
			int p = 0;
			int[] b = new int[a2];
			for (int i = 0; i < a2; i++) {
				b[i] = s.nextInt();
				if (p > b[i])
					p = p - b[i];
				else {
					a1 = a1 - b[i];
					p = p + b[i] / 10;
				}
				System.out.println(a1 + " " + p);
			}
		}
}