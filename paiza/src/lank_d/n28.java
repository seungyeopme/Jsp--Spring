package lank_d;

import java.util.Scanner;

/*
 ����� 1 �� 1�� �ο�� ��� ��ȸ�� ������߽��ϴ�.

N ����� ���� ������ ������ �� ��� ���� �� ������ �Ͼ���� ����Ͻʽÿ�.
N ����� ������ �������� N ����� ���� �ڽ� �̿ܿ� ����մϴ�.
���� �ڽſ��� �� ����� ���� ������ �� ����� �ֱ� ������ N �� (N - 1) / 2�� �䱸�˴ϴ�.

���� ��� 4 ���� ��� �Ʒ��� ���� ǥ�� �����ϴ� (�缱�� ������ �� ����Ī�� ��ġ ���� ���� ���� ����Դϴ�)

4 �� (4 - 1) / 2�� ����� �� 6 ȸ ������ �̷�����ϴ�.
�� ����Ʈ

�Է� �� 1
4
��� �� 1
6
�Է� �� 2
10
��� 2
45
 */
public class n28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int result = 0;
		int num = s.nextInt();
		
		result = num * (num -1) /2 ;
		System.out.println(result);
	}
}