package lank_d;

import java.util.Scanner;

/*
 당신은 입력 된 문자열 S를 문자 c를 표시하는 프로그램을 만들게되었습니다.
문자열 S와 문자 c가 개행 단락으로 주어지기 때문에 문자열 S의 전후를 1 문자 씩 문자 c로 둘러싸인 문자열을 출력하십시오.

예를 들어 입력 예 1의 경우

Paiza
X
다음과 같이 출력하십시오.

XPaizaX

입력 예 1
Paiza
X
출력 예 1
XPaizaX
입력 예 2
code
C
출력 2
CcodeC
 */
public class n26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String result = "";
		
		String str = s.nextLine();
		String c = s.next();
		
		result = c+str+c;
		System.out.println(result);	
	}
}
