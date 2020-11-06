package jackpot.bean;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jackpot.mail.SMTPAuthenticator;

@Controller
public class MailBean {
	@RequestMapping("/sendMail.jp")
	public String sendMail() {
		
		return "/mail/sendMail";
	}
	
	@RequestMapping("/sendMailPro.jp")
	public String sendMailPro(HttpServletRequest request) {
		// �Ķ���� �޾ƿ��� - DI�� �̿��ϸ� ���� ����
		String mail_send = request.getParameter("mail_send");
		String mail_rec = request.getParameter("mail_rec");
		String mail_title = request.getParameter("mail_title");
		String mail_content = request.getParameter("mail_content");
		
		//���� �߼��� ���� ���� ����
		
		Properties p = new Properties(); // ������ ������� ��ü
		
		//SMTP ������ ���� ����
		//���̹��� ��� ���̹� ���̵�, ������ ��� ���� �ּ� ����
		p.put("mail.smtp.user", "minyk1102@gmail.com");
		
		//SMTP ���� ���� ����
		// ���̹��� ��� smtp.naver.com, ������ ��� smtp.gmail.com
		p.put("mail.smtp.host", "smtp.gmail.com");
		
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port", "465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		
		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(p, auth);
			
			// ������ �����Ҷ� ���� ��Ȳ�� �ֿܼ� ���
			session.setDebug(true);
			
			// ������ ������ ��� ���� ��ü
			MimeMessage msg = new MimeMessage(session);
			
			// ���� ����
			msg.setSubject(mail_title);
			
			// ������ ����� �����ּ�
			Address fromAddr = new InternetAddress(mail_send);
			msg.setFrom(fromAddr);
			
			// �޴� ����� �����ּ�
			Address toAddr = new InternetAddress(mail_rec);
			msg.addRecipient(Message.RecipientType.TO, toAddr);
			
			
			// �޽��� ������ ����� ����, ĳ���� �� ����
			msg.setContent(mail_content, "text/html;charset=UTF-8");
			
			
			// �߼��ϱ�
			Transport.send(msg);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "/mail/sendMailPro";
	}
}