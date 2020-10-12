package lank_d;

import java.util.Scanner;

/*
 당신은 1 대 1로 싸우는 경기 대회를 열기로했습니다.

N 사람의 선수 무차별 대전을 할 경우 여러 번 대전이 일어나는지 출력하십시오.
N 사람의 무차별 전에서는 N 사람이 각각 자신 이외와 대결합니다.
또한 자신에서 본 결과와 상대방 측에서 본 결과가 있기 때문에 N × (N - 1) / 2로 요구됩니다.

예를 들어 4 명의 경우 아래와 같은 표와 같습니다 (사선을 축으로 한 선대칭의 위치 경기는 각각 동일 경기입니다)

4 × (4 - 1) / 2로 계산할 수 6 회 대전이 이루어집니다.
평가 포인트

입력 예 1
4
출력 예 1
6
입력 예 2
10
출력 2
45
 */
public class n28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int result = 0;
		int num = s.nextInt();
		
		result = num * (num -1) /2 ;
		System.out.println(result);
	}
}