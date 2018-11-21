package blog.subscriber;

public interface SubscriberObserver extends Observer {
    void sendPushNotification();
    void sendEmailNotification();
    void sendSmsNotification();
}
