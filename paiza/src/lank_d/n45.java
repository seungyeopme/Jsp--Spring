package lank_d;

import java.util.Scanner;

/*
 당신은 기상청의 데이터 분석 담당자로, 8월 태풍의 상륙 간격에 대한 데이터를 만들도록 요구받았습니다.

샘플이 되는 5개의 태풍에 대해 상륙한 날이 주어지므로, 각각 (2번째 이후) 에 대해 직전 상륙일과의 간격일수를 출력해 주세요.

예)
주어진 입력

1
5
15
27
28

기대하는 출력

4
10
12
1

입력되는 값
입력은 다음 형식으로 제공됩니다.

d_1
d_2
d_3
d_4
d_5
8 월의 태풍의 상륙 날짜를 나타내는 5 개의 정수가 오름차순으로 줄 바꿈으로 구분하여 부여됩니다. 
이 i 번째 (1 ≦ i ≦ 5)의 정수를 d_i로 나타냅니다.

입력 값 마지막 줄의 끝에 줄 바꿈이 하나 들어갑니다.

기대하는 출력
각 태풍에 대해 이전 태풍의 상륙 일 간격 일수를 다음 형식으로 출력합니다.
g_1
g_2
g_3
g_4

입력 예 1
5
8
19
25
31
출력 예 1
3
11
6
6
입력 예 2
2
3
7
9
28
출력 2
1
4
2
19
 */
public class n45 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num[] = new int[5];
		int result[] = new int[4];
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt();	
		}
		for(int i=0; i<result.length; i++) {
			result[i]=num[i+1]-num[i];
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}