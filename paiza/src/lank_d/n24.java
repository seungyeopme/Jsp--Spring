package lank_d;

import java.util.Scanner;

/*
 ���� N�� M�� �־����� ������ N�� M���� ���� �������� ����Ͻʽÿ�.
�����ϰ� �������� 0�� ��쵵 0���� ����Ͻʽÿ�.

�Է� �� 1
10
3
��� �� 1
1
�Է� �� 2
18
9
��� 2
0
 */
public class n24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result= 0;
		
		result = a%b;
		System.out.println(result);
	}

}
