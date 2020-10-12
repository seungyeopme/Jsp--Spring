package lank_d;

import java.util.Scanner;

/*
 "이미 자이빠는 えまな의 쿠보"

당신은 거꾸로 읽기에 빠져 있습니다. 입력되는 문자열을 역순으로 출력합니다.

예를 들어 입력 예 1의 경우 "paiza"이므로 "aziap"라고 출력됩니다.

입력은 다음 형식으로 제공됩니다.

S
· 거꾸로하고 싶은 문자열 S가 한 줄에 입력됩니다. 입력 한 줄이되어, 끝에 줄 바꿈을 하나 포함합니다.

입력 예 1
paiza
출력 예 1
aziap
입력 예 2
programming
출력 2
gnimmargorp


 */
public class n42 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}