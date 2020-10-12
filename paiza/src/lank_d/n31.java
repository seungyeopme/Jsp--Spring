package lank_d;

import java.util.Scanner;

/*
당신은 올림픽 메달리스트 테이블 작성 원입니다.

금 ·은 · 동메달리스트 인 국가 · 선수 이름이 차례로 주어지기 때문에 각 국가 · 선수 이름 앞에 훈장 획득 
( "Gold", "Silver", "Bronze")을 적어 보겠습니다.

예)
주어진 입력

Japan
Russia
China

기대하는 출력

Gold Japan
Silver Russia
Bronze China

입력되는 값
입력은 다음 형식으로 제공됩니다.

n_g
n_s
n_b
· 첫 번째 줄에 금메달 승자의 이름을 나타내는 문자열 n_g이 주어집니다.
· 두 번째 줄에 은메달 승자의 이름을 나타내는 문자열 n_s이 주어집니다.
· 3 번째 줄에 동메달 획득의 이름을 나타내는 문자열 n_b이 주어집니다.
· 입력은 총 3 행이 입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
리스트 테이블을 다음 형식으로 출력합니다.
m_g n_g
m_s n_s
m_b n_b

· 기대하는 출력은 3 행으로 구성됩니다.
· 첫 번째 줄에 "금메달"을 의미하는 문자열 m_g ( "Gold")와 n_g를 순서대로 공백으로 구분하여 출력합니다.
· 두 번째 줄에 '은메달'을 의미하는 문자열 m_s ( "Silver")와 n_s를 순서대로 공백으로 구분하여 출력합니다.
· 세 번째 줄에 "동메달"을 의미하는 문자열 m_b ( "Bronze")와 n_b를 순서대로 공백으로 구분하여 출력합니다.
· 출력의 마지막에 개행을 넣어 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
Ono
Orujov
Shavdatuashvili
출력 예 1
Gold Ono
Silver Orujov
Bronze Shavdatuashvili
입력 예 2
Ogino
Kalisz
Seto
출력 2
Gold Ogino
Silver Kalisz
Bronze Seto


 */
public class n31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String g = "Gold ";
		String s = "Silver ";
		String b = "Bronze ";
		
		String result1 = "";
		String result2 = "";
		String result3 = "";
		
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
		
		result1 = g + name1;
		result2 = s + name2;
		result3 = b + name3;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}