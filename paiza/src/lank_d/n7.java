package lank_d;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
공백으로 구분 서기 y 달 m 일 d가 입력됩니다.

"/"로 구분하여 문자열로 출력하십시오.

예
2016 2 12
입력 된 경우
2016/2/12
출력하십시오.
평가 포인트
10 회 테스트 케이스에서 정답률 실행 속도, 메모리 소비를 도모 점수가 결정됩니다.
더 빠른 응답 시간에 제출하는 것이 점수가 높아집니다.
여러 테스트 케이스에서 올바른 출력이되는지 평가 (+50 점)
해답까지의 속도 평가 (+50 점)

입력되는 값
입력은 다음 형식으로 제공됩니다.
ymd

입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
서기 y 달 m 일 d를 "/"로 구분 된 문자열로 출력합니다.

마지막 개행하고 불필요한 문자 빈 행을 포함하지 마십시오.

조건
모든 테스트 케이스에서 다음의 조건을 충족합니다.
· 2000 ≦ y ≦ 2016
· 1 ≦ m ≦ 12
· 1 ≦ d ≦ 31

y m, d는 정수
실제 날짜하지 않을 수 있습니다.

입력 예 1
2016 2 12

출력 예 1
2016/2/12

입력 예 2
2000 1 1

출력 2
2000/1/1
*/
public class n7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		str = str.replaceAll(" ", "/");
	
		System.out.println(str);
	}
}
