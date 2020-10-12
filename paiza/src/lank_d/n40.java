package lank_d;

import java.util.Scanner;

/*
 당신은 반각 알파벳의 성씨와 이름에서 각각 첫 글자를 가지고 이니셜을 만들기로했습니다.
공백으로 구분 성씨와 이름이 입력되기 때문에 첫 번째 문자를 가지고 ""(반각 점)로 구분 된 문자열을 출력합니다.

예를 들어 다음과 같은 입력의 경우
Paiza Tarou
다음과 같이 출력하십시오
PT

입력되는 값
입력은 다음 형식으로 제공됩니다.

st


입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

입력 예 1
Midorikawa Tsubame
출력 예 1
M.T
입력 예 2
Paiza Tarou
출력 2
P.T
 */
public class n40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String dot = ".";
		String st1 = s.next();
		String st2 = s.next();
		
		System.out.println(st1.charAt(0)+dot+st2.charAt(0));
		
	}
}