package lank_d;

import java.util.Scanner;

/*
 �ݰ� ���ĺ����� ������ ���ڿ� S�� ���� ���� N �Էµ˴ϴ�.

1 ���� �����κ��� N ���� �������� ����Ͻʽÿ�.

��
abcdefg
4
�Է� �� ���

abcd
����Ͻʽÿ�.

�Է� �� 1
aabbccdd
5
��� �� 1
aabbc
�Է� �� 2
oiuytrer
8
��� 2
oiuytrer
 */
public class n23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		String str=s.nextLine();
		int su=s.nextInt();
		
		System.out.println(str.substring(0, su));
	}
}