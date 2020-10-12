package lank_d;

import java.util.Scanner;

/*
 4 개의 숫자를 다음과 같은 형식으로 나열되어 2 차 행렬과 부릅니다.
 a b
 c d
이 2 차 행렬에 대해 a × d - b × c를 계산 한 값이 2 차 행렬의 행렬식으로 부릅니다.
있는 2 차 행렬이 주어 졌을 때 그 행렬식을 구하는 프로그램을 작성하십시오.
예)
 1 2
 3 4
위와 같은 행렬의 행렬식은 1 × 4 - 3 × 2 = -2입니다 (입력 예 1).

입력 예 1
1 2
3 4
출력 예 1
-2
입력 예 2
-50 10
25 -5
출력 2
0
 */
public class n21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int insert, result;
		
		int [][] arr= new int[2][2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				insert = s.nextInt();
				arr[i][j] = insert;
			}
		}
		result = arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
		System.out.println(result);
	}
}
