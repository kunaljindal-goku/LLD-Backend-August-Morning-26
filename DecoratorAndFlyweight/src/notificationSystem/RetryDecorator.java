package notificationSystem;

import java.nio.file.Path;

public class RetryDecorator extends NotificationDecorator{

    private int maxAttempts;

    public RetryDecorator(NotificationService notificationService, int maxAttempts) {
        super(notificationService);
        this.maxAttempts = maxAttempts;
    }

    @Override
    public void send(String message, String userId) {
        int attempts = 0;
        try {
            notificationService.send(message,userId);
            System.out.println("Message sent on attempt: "+attempts);
        }
        catch (Exception e) {
            attempts++;
            if(attempts==maxAttempts) {
                System.out.println("retyr failed");
                throw e;
            }
        }
    }
}
