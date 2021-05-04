import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Sendmail2 {
    static String MyAccount = "";
    static String Password = "";
    public static int smail(String r, String sub,String mymess)
    {
       Properties p = new Properties();
       p.put("mail.smtp.auth","true");
       p.put("mail.smtp.starttls.enable","true");
       p.put("mail.smtp.host","smtp.gmail.com");
       p.put("mail.smtp.port","587");
        
       Session session;
       session = Session.getInstance(p, new Authenticator() {
           
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
              return new PasswordAuthentication( MyAccount, Password);
           }
       });
       
        MimeBodyPart b = new MimeBodyPart();
        try {
            b.setText(mymess,"utf-8","html");
        } catch (Exception ex) {
              Wrong obj1 = new Wrong("Kindly check your Credentials or Internet Connecton...");
              obj1.setVisible(true);
        }
        
        MimeMultipart mp = new MimeMultipart();
        try {
            mp.addBodyPart(b);
        } catch (Exception ex) {
             Wrong obj1 = new Wrong("Kindly check your Credentials or Internet Connecton...");
              obj1.setVisible(true);
        }
        
        Message message = prepareMessage(session, MyAccount,r,sub,mp);
        int i = 1;
        try {
            Transport.send(message);
        } catch (Exception ex) {
             i--;
              System.out.println(ex.getMessage());
              Wrong obj1 = new Wrong("Kindly check your Credentials or Internet Connecton...");
              obj1.setVisible(true);
        }
        return i;
    }
    private static Message prepareMessage(Session session, String MyAccount, String r,String sub, Multipart mp) {
        try {
            Message m = new MimeMessage(session);
            m.setFrom(new InternetAddress(MyAccount));
            m.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(r) );
            m.setSubject(sub);
            m.setContent(mp);
            return m;
        } catch (Exception ex) { 
             Wrong w = new Wrong("Kindly check your Credentials or Internet Connecton...");
             w.setVisible(true);
        }
        return null;
    }
}