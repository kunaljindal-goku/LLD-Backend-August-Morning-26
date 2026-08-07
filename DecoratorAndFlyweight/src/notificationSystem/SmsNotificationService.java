package notificationSystem;

public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message, String userId) {
        // Real: API call to some SMS provider
        System.out.println("Sending SMS to "+userId+ " content: "+message);
    }
}
