package notificationSystem;

import com.sun.source.tree.NewArrayTree;

public class Client {

    public static void main(String[] args) {
        NotificationService notificationService = new SmsNotificationService();


        notificationService = new LoggingDecorator(notificationService);
        notificationService = new RetryDecorator(notificationService,5);
        notificationService.send("Hello","kunal-jindal");

        NotificationService email = new EmailNotificationService();
        email = new LoggingDecorator(email);

        email.send("Hello","goku123");

    }
}
