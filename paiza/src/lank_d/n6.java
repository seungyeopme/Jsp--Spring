package lank_d;

import java.util.Scanner;

/*
당신은 와인 종목의 마케팅을 담당하고 있습니다. 좋은 카피를 생각하는 우선 "~ 중 최고"라는 문구를 다양한 만들어보기로했습니다.

두 문자열이 주어지기 때문에 "Best in"과 그 문자열을 모두 공백으로 구분하여 결합하여 출력합니다.


예)

hundred years → Best in hundred years

the universe → Best in the universe

입력되는 값
입력은 다음 형식으로 제공됩니다.

s_1 s_2
문자열 s가 주어집니다. 입력 한 줄이되어, 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
"Best in", s_1, s_2을 공백으로 구분하여 결합하여 출력합니다. 출력의 끝에 줄 바꿈을 하나 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

출력의 끝에 줄 바꿈을 하나 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

조건
모든 테스트 케이스에서 다음의 조건을 채우고 있습니다.

· s_1, s_2은 문자로 구성된 문자열 (공백 등은 제외)
· 1 ≦ (s_1 길이) (s_2 길이) ≦ 20

입력 예 1
a decade
출력 예 1
Best in a decade
입력 예 2
the world
출력 2
Best in the world
입력 예 3
history ever
출력 3
Best in history ever
*/


public class n6 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String a="Best in ";
		
		String b=s.nextLine();
		
		String result = a.concat(b);
		System.out.println(result);
	}
}
