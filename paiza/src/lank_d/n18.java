package lank_d;

import java.util.Scanner;

/*
 E ���� �ּҴ� ���� �κа� �������� '@'�� ���� ���ڿ��� ǥ�õ˴ϴ�.

���θ� s �������� t���� ���� ���� n�� ���ڿ��� �� �ٲ����� �����Ͽ� �Էµ˴ϴ�.

���� ������ ���� ���ڿ��� ����մϴ�.

s (����) @t (������)

��
info
paiza.jp
���� �Է��� ���

info@paiza.jp
����Ͻʽÿ�.

�Է� �� 1
paiza
example.com
��� �� 1
paiza@example.com
�Է� �� 2
paiza.tarou2015
paiza.jp
��� 2
paiza.tarou2015@paiza.jp

 */
public class n18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String id =s.next();
		String domain = s.next();
		char sum = '@';
		String result="";
		
		result = id + sum + domain;
		System.out.println(result);
		

	}
}
