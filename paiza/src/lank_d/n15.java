package lank_d;

import java.util.Scanner;

/*
 �ݰ� ���ĺ� �ҹ��ڷ� ������ ���� n�� ���ڿ� s�� �־����ϴ�.

���ڿ� s�� �빮�ڷ� ��ȯ�Ͽ� ����Ͻʽÿ�.

�Է� �� 1
paiza
��� �� 1
PAIZA
�Է� �� 2
abcdefghijklmnopqrstuvwxyz
��� 2
ABCDEFGHIJKLMNOPQRSTUVWXYZ

 */
public class n15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String input = "";
		String output = "";
		int tmp;
		
		input=s.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			tmp = (int)input.charAt(i); //���ڿ��� �ƽ�Ű �ڵ�(����)�� ����Ǳ� ������ int������ ��ȯ
			
			if((65<=tmp)&&(tmp<=90)) { //�빮���� ���
				output += (char)(tmp + 32); //32�� ���ؼ� �ҹ��ڷ� ��ȯ
			}
			else if((97<=tmp)&&(tmp <=122)) {
				output += (char)(tmp - 32); //32�� ���� �빮�ڷ� ��ȯ
			}
			else { //�� ���� ���ڿ��� ���
				output += (char)tmp; //�״�� ���
				
			}
		}
		System.out.println(output);
	}
}
