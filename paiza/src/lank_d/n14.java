package lank_d;

import java.util.Scanner;

/*
 �ִ� 10 ������ ���� ���� n�� �־����ϴ�.

n�� ���� �ڸ��� ���ڷ� ����մϴ�.

�Է� �� 1
100
��� �� 1
3
�Է� �� 2
4304
��� 2
4

 */
public class n14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int length = (int)(Math.log10(num)+1);
		
		System.out.println(length);

	}

}
