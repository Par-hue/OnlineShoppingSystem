package observer;

public class NotificationService implements Observer {
    public void update(String event) {
        System.out.println("Notification sent: " + event);
    }
}
