package notificationSystem;

public abstract class NotificationDecorator implements NotificationService{
     protected NotificationService notificationService;

    public NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
