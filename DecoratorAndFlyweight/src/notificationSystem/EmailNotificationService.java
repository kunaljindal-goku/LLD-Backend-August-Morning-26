package notificationSystem;

import decorator.Coffee;
import decorator.Condiment;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message, String userId) {
        // API call
        System.out.println("Sebding Email to "+userId+" content: "+ message);
    }
}
