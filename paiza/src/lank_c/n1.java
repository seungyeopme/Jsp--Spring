package lank_c;

import java.util.Scanner;

/*
 Leet라는 인터넷 속어가 있습니다.
Leet는 어떤 알파벳을 닮은 형태의 다른 문자로 대체 표기합니다. Leet 대체 규칙은 많이 있지만, 
여기에서는 다음의 대체 규칙만을 생각합시다.
대체 전	대체 후
A	4
E	3
G	6
I	1
O	0
S	5
Z	2
문자열이 입력되므로이를 Leet로 변환하여 출력하는 프로그램을 작성하십시오.

입력되는 값
입력은 다음 형식으로 제공됩니다.

s
s는 Leet로 변환하기 전에 문자열을 나타냅니다.

기대하는 출력
s를 Leet로 변환 한 문자열을 한 줄에 출력합니다.

마지막 개행하고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
PAIZA
출력 예 1
P4124
입력 예 2
ALANTURING
출력 2
4L4NTUR1N6

 */
public class n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		String rt=str.replace("A","4").replace("E", "3").replace("G", "6").replace("I","1")
				.replace("O", "0").replace("S", "5").replace("Z", "2");
		System.out.println(rt);
	}
}