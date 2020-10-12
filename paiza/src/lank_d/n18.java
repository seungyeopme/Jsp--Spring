package lank_d;

import java.util.Scanner;

/*
 E 메일 주소는 로컬 부분과 도메인을 '@'를 잡은 문자열로 표시됩니다.

지부를 s 도메인을 t으로 각각 길이 n의 문자열을 줄 바꿈으로 구분하여 입력됩니다.

다음 구문에 따라 문자열을 출력합니다.

s (지부) @t (도메인)

예
info
paiza.jp
같은 입력의 경우

info@paiza.jp
출력하십시오.

입력 예 1
paiza
example.com
출력 예 1
paiza@example.com
입력 예 2
paiza.tarou2015
paiza.jp
출력 2
paiza.tarou2015@paiza.jp

 */
public class n18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String id =s.next();
		String domain = s.next();
		char sum = '@';
		String result="";
		
		result = id + sum + domain;
		System.out.println(result);
		

	}
}
