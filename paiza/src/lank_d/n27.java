package lank_d;

import java.util.Scanner;

/*
 �� ���� a, b�� �������� ���� �� ������ �Էµ˴ϴ�.

a ~ b�� �� ������ ����մϴ�.

��
1990 2014
�Է� �� ���
24
����Ͻʽÿ�.

�Է� �� 1
1999 2000
��� �� 1
1
�Է� �� 2
794 1192
��� 2
398
 */
public class n27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int result = 0;
		int a=s.nextInt();
		int b=s.nextInt();
		
		result = b - a;
		System.out.println(result);	
	}
}