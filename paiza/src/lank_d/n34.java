package lank_d;

import java.util.Scanner;

/*
 당신은 새로운 책장을 사려고 검토하고 있습니다. 그래서 이미 책의 폭 등에서 들어갈 지 예상하기로했습니다.

이 책의 폭을 합한 n (cm), 검토하고있는 책장의 단수 d 본 맞는 폭 e (cm)이 각각 공백으로 구분하여 부여됩니다.
대략이므로 본 각각의 차이 1 단에 들어가는 지 생각하지 않기로합니다.

예를 들어, 책의 폭을 합계 한 것이 400 (cm), 검토하고있는 책장의 단수가 5 책이 들어가는 폭이 85 (cm)의 경우 다음과 같은 입력이됩니다
400 5 85
각 단의 폭을 합한 85 배 5에서 425 (cm)로 400 (cm) 책은 맞는 때문에 다음과 같이 출력하십시오.
OK


입력되는 값
입력은 다음 형식으로 제공됩니다.
nde

입력 예 1
400 5 85
출력 예 1
OK
입력 예 2
500 4 70
출력 2
NG
 */
public class n34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int[] num = new int[3];
		for(int i=0; i<num.length; i++) {
			num[i]=s.nextInt();
		}
		if(num[0]<num[1]*num[2]) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
	}
}