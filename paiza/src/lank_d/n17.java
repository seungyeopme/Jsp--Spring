package lank_d;

import java.util.Scanner;

/*
 ����� �۳�ȸ ���縦 �þҽ��ϴ�.
���Ը� �����Ϸ��� ����������, ���� ������ �ʴ� ����� �־�, ������ ���ָ� �� �� ��� 
���� ����� �ִٴ� ���� ���޾ҽ��ϴ�.

������ ������ �ִ� ���� 6000��, ������ ���� ���� 4000���� ���Կ���
���ָ� ���������� �� �� �ִ� �ο��� n��, ������ ���ָ� ���� �ʴ� �ο��� m��
���� �־����� ��ŭ �հ谡 �� �������� ����� �ּ���.

���� ��� �Է� ��1������ ������ ���ָ� �Ѵ� ����� 12��, 
������ ���ָ� ���� �ʴ� ����� 5���� ��찡 �Ǿ�
12 5
�ԷµǹǷ� 12 �� 6000 �� + 5 �� 4000 ���Ǿ�, �� 92000 ���̹Ƿ�

92000

�Է� �� 1
12 5
��� �� 1
92000
�Է� �� 2
1 1
��� 2
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
