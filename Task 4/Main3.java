package Lab4;
interface MessageSender {
    void sendMessage(String message);
}
class EmailSender implements MessageSender {
    public void sendMessage (String message) {
        System.out.println("Sending email: " + message);
    }
}
class SMSSender implements MessageSender {
    public void sendMessage (String message) {
        System.out.println("Sending SMS: " + message);
    }
}
class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
 public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}
public class Main3 {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService emailNotification = new NotificationService(email);
        emailNotification.alertUser("Hello! Your account has been created.");
        System.out.println();
        MessageSender sms = new SMSSender();
        NotificationService smsNotification = new NotificationService(sms);
        smsNotification.alertUser("Alert! OTP is 1234.");
    }
}


