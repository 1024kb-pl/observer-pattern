package blog.subscriber;

public class BlogSubscriber implements SubscriberObserver {
    private final static String RESULT_INFORMATION = "[%s] %s, you have %d unread articles";
    private final Subscriber subscriber;
    private int amountUnreadArticles = 0;

    public BlogSubscriber(Subscriber subscriber) {
        this.subscriber=subscriber;
    }

    @Override
    public void update() {
        amountUnreadArticles++;
        sendEmailNotification();
        sendPushNotification();
        sendSmsNotification();
    }

    @Override
    public void sendPushNotification() {
        if (subscriber.isPushNotificationEnabled()) {
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.PUSH, subscriber.getName(), amountUnreadArticles));
        }
    }

    @Override
    public void sendEmailNotification() {
        if (subscriber.isEmailNotificationEnabled()) {
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.EMAIL, subscriber.getEmail(), amountUnreadArticles));
        }
    }

    @Override
    public void sendSmsNotification() {
        if (subscriber.isSmsNotificationEnabled()) {
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.SMS, subscriber.getPhoneNumber(), amountUnreadArticles));
        }
    }
}
