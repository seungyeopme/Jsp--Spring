package lank_d;

import java.util.Scanner;

/*
 ����� Ŭ���������� �ȸ ��� �ڶ����� �ΰ� �Ƕ�̵带 �� ���̵Ǿ����ϴ�. �ִ� �ܼ��� �Ƕ�̵带 ¥�µ� �ʿ��� �ο��� �䱸�ϴ� ���α׷��� ����� ���ô�.

�Ƕ�̵�� ������ ���� ������ i �� ������ i ����� �ʿ��մϴ�.

��)

�Ƕ�̵��� �ܼ� : 5 ��
1 + 2 + 3 + 4 + 5 = 15
�� �ʿ��� �ο� : 15 ��

�Ƕ�̵��� �ܼ� : 7 ��
1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
�� �ʿ��� �ο� : 28 ��

�Է� �� 1
4
��� �� 1
10
�Է� �� 2
10
��� 2
55
�Է� �� 3
50
��� 3
1275
 */
public class n22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int sum = 0;
		int i;
		int num=s.nextInt();
		for(i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
