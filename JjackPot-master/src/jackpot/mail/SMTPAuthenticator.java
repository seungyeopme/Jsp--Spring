package jackpot.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/*
 * SMTP ������ �α����ϱ� ���� ���������� ��� �ִ� Ŭ���� 
 */
public class SMTPAuthenticator extends Authenticator {
	public PasswordAuthentication getPasswordAuthentication() {
		/*
		 * Gmail Ȥ�� ���̹� �̸��� �̿� ����.
		 * Gmail�� ��� ���̵� �Է��ϸ� �ȴ�.
		 */
		return new PasswordAuthentication("minyk1102", "kk753951!!");
	}
}
