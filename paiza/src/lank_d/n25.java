package lank_d;

import java.util.Scanner;

/*
 ����� ����ġ�� ���¸� ǥ���ϴ� ���α׷��� �ۼ��ϰ� �ֽ��ϴ�.
�� ����ġ�� 1 �� ������ "ON"�� "OFF"�� ��ȯ�˴ϴ�.

����ġ�� �ʱ� ���´� "OFF"����ġ�� ���� Ƚ�� n�� �ԷµǹǷ� n �� ����ġ�� ���� �� �� ���¸� ����մϴ�.

�Է� �� 1
3
��� �� 1
ON
�Է� �� 2
6
��� 2
OFF
 */
public class n25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		String off = "OFF";
		String on = "ON";
		
		int su = s.nextInt();
		
		if(su%2==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
	}
}