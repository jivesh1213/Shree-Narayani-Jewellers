package pojo;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtility {
    public static void sendEmail(String host, String port, final String userName, final String password, String toAddress, String subject, String message) throws AddressException, MessagingException{
        Properties property = new Properties();
        property.put("mail.smtp.host", host);
        property.put("mail.smtp.port", port);
        property.put("mail.smtp.auth", "true");
        property.put("mail.smtp.starttls.enable", "true");
        
        Authenticator auth = new Authenticator(){
          @Override
          public PasswordAuthentication  getPasswordAuthentication(){
              return new PasswordAuthentication(userName, password);
          }
        };
       
        Session session = Session.getInstance(property, auth);
        
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(userName));
        InternetAddress addresses = new InternetAddress(toAddress);
        msg.setRecipient(Message.RecipientType.TO, addresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(message);
        
        Transport.send(msg);
    }
}
