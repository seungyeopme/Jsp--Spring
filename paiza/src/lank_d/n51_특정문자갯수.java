package lank_d;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 당신은 회사와 거래를하고 있으며, 최근 10 개의 요청을 제출했는데, 지금 요구 여부를 쓴 종이를 보냈습니다.
그 종이에는 상대방이 승낙 한 주장에 대해서는 yes의 머리 글자 "y"동의하지 않았다 주장에 대해서는 
no의 머리 글자 "n"며 "y"와 "n"만 10 개 줄 지어있었습니다 .

이 때 여러 요청을 수락되었는지를 반환 프로그램을 작성하십시오.

예를 들어, 입력 예 1에서는 상대방의 대답이 "yyyynnnnny"그래서 수락 된 요청은 5 개이고, 5를 표시합니다.

입력되는 값
입력은 다음 형식으로 제공됩니다.

S
· 첫 번째 줄에는 상대방의 응답을 나타내는 문자열 S가 주어집니다.
· 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
승인 된 요청 수를 정수로 출력합니다.

끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

조건
모든 테스트 케이스에서 다음의 조건을 채우고 있습니다.

· 문자열 S의 길이 = 10
· S는 "y" "n"만으로

입력 예 1
yyyynnnnny
출력 예 1
5
입력 예 2
nnnnnnnnnn
출력 2
0
 */
public class n51_특정문자갯수 {
	public static int getCount(String s) {
        int count = 0;
         
        Pattern p = Pattern.compile("y");
        Matcher m = p.matcher(s);
         
        for (int i = 0; m.find(i); i = m.end()) {
            count++;
        }
        return count;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
        int cnt = getCount(s);
        System.out.println(cnt);
    }
}