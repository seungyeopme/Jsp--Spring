package lank_d;

import java.util.Scanner;

/*
���ڰ��� ���� Paiza Pay �� �ܾ� 10,000 �� �̸��� �� 
�ڵ����� 10,000 ���� ������ �ִ� ���񽺸� �����ϰ� �Ǿ����ϴ�.

�ܾ��� �ԷµǹǷ� �����ؾ� �ϴ��� ���θ� �Ǵ��ϰ� ������ ���� 
���� �� �ܾ�, �ʿ� ���� ���� �״���� �ܾ��� ����� �ֽʽÿ�.

�Է� �� 1
2980
��� �� 1
12980
�Է� �� 2
15000
��� 2
15000
 */
public class n16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int m= s.nextInt();
		int result = 0;
		if(m <10000) {
			result =m+10000;
		}
		else {
			result = m;
		}
		System.out.println(result);
	}
}
