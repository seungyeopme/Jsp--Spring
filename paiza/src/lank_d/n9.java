package lank_d;

import java.util.Scanner;

/*
 당신은 연필 상자 구입했습니다. 각 상자에는 12 연필이 들어 있습니다.
총 수십개의 연필을 샀는지가 입력되므로 구입 연필의 개수를 출력합니다.
12는 12 개입니다.

입력되는 값
입력은 다음 형식으로 제공됩니다.

N
연필이 수십개 있는지를 나타내는 정수 N이 1 행에 입력됩니다.
입력은 한 줄이되어, 끝에 줄 바꿈을 하나 포함합니다.

연필의 개수를 정수로 출력합니다.
끝에 줄 바꿈을 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
3
출력 예 1
36

입력 예 2
43
출력 2
516
 */
public class n9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		int result=num*12;
		
		System.out.println(result);
	}
}