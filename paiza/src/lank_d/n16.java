package lank_d;

import java.util.Scanner;

/*
전자결제 서비스 Paiza Pay 는 잔액 10,000 엔 미만일 때 
자동으로 10,000 엔을 충전해 주는 서비스를 시작하게 되었습니다.

잔액이 입력되므로 충전해야 하는지 여부를 판단하고 충전할 때는 
충전 후 잔액, 필요 없는 경우는 그대로의 잔액을 출력해 주십시오.

입력 예 1
2980
출력 예 1
12980
입력 예 2
15000
출력 2
15000
 */
public class n16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int m= s.nextInt();
		int result = 0;
		if(m <10000) {
			result =m+10000;
		}
		else {
			result = m;
		}
		System.out.println(result);
	}
}
