package lank_d;

import java.util.Scanner;

/*
 당신의 클래스에서는 운동회 장기 자랑에서 인간 피라미드를 할 일이되었습니다. 있는 단수의 피라미드를 짜는데 필요한 인원을 요구하는 프로그램을 만들어 봅시다.

피라미드는 다음과 같이 위에서 i 단 눈에는 i 사람이 필요합니다.

예)

피라미드의 단수 : 5 단
1 + 2 + 3 + 4 + 5 = 15
→ 필요한 인원 : 15 명

피라미드의 단수 : 7 단
1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
→ 필요한 인원 : 28 명

입력 예 1
4
출력 예 1
10
입력 예 2
10
출력 2
55
입력 예 3
50
출력 3
1275
 */
public class n22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int sum = 0;
		int i;
		int num=s.nextInt();
		for(i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
