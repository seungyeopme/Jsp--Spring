package lank_d;

import java.util.Scanner;

/*
 ����� �Է� �� ���ڿ� S�� ���� c�� ǥ���ϴ� ���α׷��� ����ԵǾ����ϴ�.
���ڿ� S�� ���� c�� ���� �ܶ����� �־����� ������ ���ڿ� S�� ���ĸ� 1 ���� �� ���� c�� �ѷ����� ���ڿ��� ����Ͻʽÿ�.

���� ��� �Է� �� 1�� ���

Paiza
X
������ ���� ����Ͻʽÿ�.

XPaizaX

�Է� �� 1
Paiza
X
��� �� 1
XPaizaX
�Է� �� 2
code
C
��� 2
CcodeC
 */
public class n26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String result = "";
		
		String str = s.nextLine();
		String c = s.next();
		
		result = c+str+c;
		System.out.println(result);	
	}
}
