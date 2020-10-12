package lank_d;

import java.util.Scanner;

/*
 반각 알파벳 소문자로 구성된 길이 n의 문자열 s가 주어집니다.

문자열 s를 대문자로 변환하여 출력하십시오.

입력 예 1
paiza
출력 예 1
PAIZA
입력 예 2
abcdefghijklmnopqrstuvwxyz
출력 2
ABCDEFGHIJKLMNOPQRSTUVWXYZ

 */
public class n15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String input = "";
		String output = "";
		int tmp;
		
		input=s.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			tmp = (int)input.charAt(i); //문자열은 아스키 코드(숫자)로 저장되기 때문에 int형으로 변환
			
			if((65<=tmp)&&(tmp<=90)) { //대문자인 경우
				output += (char)(tmp + 32); //32를 더해서 소문자로 변환
			}
			else if((97<=tmp)&&(tmp <=122)) {
				output += (char)(tmp - 32); //32를 빼서 대문자로 변환
			}
			else { //그 외의 문자열인 경우
				output += (char)tmp; //그대로 출력
				
			}
		}
		System.out.println(output);
	}
}
