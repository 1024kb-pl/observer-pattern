package blog.subscriber;

public interface Subscriber {
    boolean isEmailNotificationEnabled();
    boolean isPushNotificationEnabled();
    boolean isSmsNotificationEnabled();
    String getName();
    String getEmail();
    String getPhoneNumber();
}
