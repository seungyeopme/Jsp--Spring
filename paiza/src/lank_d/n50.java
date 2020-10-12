package lank_d;

import java.util.Scanner;

/*
 당신은 컨디션 관리를 위해 날씨 최고 기온, 최저 기온 1 일의 기온이 몇 변화하고 있는지를 알고 싶어졌습니다.

어느 날의 최고 기온 t과 최저 기온 u가 공백으로 구분하여 입력되므로 하루의 기온이 몇 변화하고 있는지를 출력합니다.

예를 들어 다음과 같이 입력 된 경우 최고 기온이 7도, 최저 기온이 -3도를 의미

7 -3
온도의 차이는 10이므로 다음과 같이 출력합니다.

10

입력되는 값
입력은 다음 형식으로 제공됩니다.

t u
· t는 최고 기온 u는 최저 기온

· 입력은 한 줄이되어, 끝에 줄 바꿈을 하나 포함합니다.

기대하는 출력
어느 날의 최고 기온 t과 최저 기온 u가 공백으로 구분하여 입력되므로 하루의 기온이 몇 변화하고 있는지를 출력합니다.

출력 마지막에 개행을 하나 넣고 불필요한 문자 빈 행을 포함하지 마십시오.

입력 예 1
7 -3
출력 예 1
10
입력 예 2
18 17
출력 2
1
 */
public class n50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int result=0;
		result = a-b;
		System.out.println(result);
	}
}
