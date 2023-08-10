
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

    private static boolean send(String to, String from, String subject, String msg) {
        boolean flag = false;

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        String username = "graphicalpassauthentication";
//            String pass="qfigicdwqhonvupa"; 
        String pass = "lsekxpgttscbjhqd";

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, pass);
            }

        });

        try {
            Message message = new MimeMessage(session);

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));

            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            flag = true;

        } catch (MessagingException e) {
            System.out.print(e.getMessage());
        }

        return flag;
    }

    public static boolean sendemail(String to, String otp) {
        String from, sub, msg;
        from = "graphicalpassauthentication@gmail.com";
        sub = "Graphical Password Authentication";
        msg = otp;

        boolean flag;
        flag = send(to, from, sub, msg);

        return flag;
    }

    public static String generateotp() {
        return new DecimalFormat("000000").format(new Random().nextInt(999999));
    }
}
