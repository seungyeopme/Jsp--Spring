package lank_d;

import java.util.Scanner;

/*
 4 ���� ���ڸ� ������ ���� �������� �����Ǿ� 2 �� ��İ� �θ��ϴ�.
 a b
 c d
�� 2 �� ��Ŀ� ���� a �� d - b �� c�� ��� �� ���� 2 �� ����� ��Ľ����� �θ��ϴ�.
�ִ� 2 �� ����� �־� ���� �� �� ��Ľ��� ���ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
��)
 1 2
 3 4
���� ���� ����� ��Ľ��� 1 �� 4 - 3 �� 2 = -2�Դϴ� (�Է� �� 1).

�Է� �� 1
1 2
3 4
��� �� 1
-2
�Է� �� 2
-50 10
25 -5
��� 2
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
