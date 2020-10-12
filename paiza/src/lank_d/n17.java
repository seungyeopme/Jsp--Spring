package lank_d;

import java.util.Scanner;

/*
 당신은 송년회 간사를 맡았습니다.
가게를 예약하려고 생각했지만, 술을 마시지 않는 사람이 있어, 무제한 음주를 할 수 없어서 
좋은 사람이 있다는 것을 깨달았습니다.

무제한 리필이 있는 경우는 6000엔, 리필이 없는 경우는 4000엔의 가게에서
음주를 무제한으로 할 수 있는 인원이 n명, 무제한 음주를 켜지 않는 인원이 m인
각각 주어지는 만큼 합계가 몇 엔인지를 출력해 주세요.

예를 들어 입력 예1에서는 무제한 음주를 켜는 사람이 12명, 
무제한 음주를 켜지 않는 사람이 5명의 경우가 되어
12 5
입력되므로 12 × 6000 엔 + 5 × 4000 엔되어, 총 92000 엔이므로

92000

입력 예 1
12 5
출력 예 1
92000
입력 예 2
1 1
출력 2
10000
 */
public class n17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int beer_ok = s.nextInt();
		int beer_no = s.nextInt();
		int sum_ok = 0;
		int sum_no = 0;
		int sum = 0;
		
		sum_ok = beer_ok * 6000;
		sum_no = beer_no * 4000;
		sum = sum_ok + sum_no;
		System.out.println(sum);	
	}
}
