package lank_d;

import java.util.Scanner;

/*
 반각 알파벳으로 구성된 문자열 S와 양의 정수 N 입력됩니다.

1 문자 눈으로부터 N 문자 눈까지를 출력하십시오.

예
abcdefg
4
입력 된 경우

abcd
출력하십시오.

입력 예 1
aabbccdd
5
출력 예 1
aabbc
입력 예 2
oiuytrer
8
출력 2
oiuytrer
 */
public class n23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		String str=s.nextLine();
		int su=s.nextInt();
		
		System.out.println(str.substring(0, su));
	}
}