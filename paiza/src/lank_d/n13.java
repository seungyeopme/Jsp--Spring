package lank_d;

import java.util.Scanner;

/*
 당신은 사람이 모이는 시설의 사람의 밀도 계산을하고 있습니다. 일정한 면적을 확보하기 위해 다음과 같은 계산을하기로했습니다.
1 인당 필요한 면적 N과 인원 M이 주어 지므로 총 면적이 몇 필요한지를 출력합니다.

예를 들어 입력 예 1의 경우
4
15
　 면적 4 인원 15이되므로
60
출력하십시오.

입력 예 1
4
15
출력 예 1
60
입력 예 2
3
12
출력 2
36
 */
public class n13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result;
		result = a*b;
		System.out.println(result);
		
	}
}
