package lank_d;

import java.util.Scanner;

/*
 �ð� �� n�� �κ��� ���� �Ѿ 25 �ð��Ǿ� ���� ���� 1�ÿ��ϵ��� 0 �ú� �� 23 �ñ� �� 24 �ð� ǥ��� 
 ��Ȯ�� ��ġ�� �����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.

���� ��� �Է� �� 1������

32
32���̸�, ����� ������ 8���̹Ƿ�

8
����Ͻʽÿ�.

�Է� �� 1
32
��� �� 1
8

�Է� �� 2
47
��� 2
23
 */
public class n12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int h=s.nextInt();
		int result = 0;
		if(h>=24) {
			result = h-24;
			System.out.println(result);
		}
		else {
			System.out.println(h);
		}
	}
}