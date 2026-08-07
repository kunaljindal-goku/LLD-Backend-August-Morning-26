package notificationSystem;

public class LoggingDecorator extends NotificationDecorator {


    public LoggingDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println("[LOG] Sending notification");
        notificationService.send(message,userId);
        System.out.println("[LOG] Message sent");
    }
}
