package blog.subscriber;

public interface Subscriber {
    boolean isEmailNotificationEnabled();
    boolean isPushNotificationEnabled();
    boolean isSmsNotificationEnabled();
    void setPushNotificationEnable(boolean state);
    void setEmailNotificationEnable(boolean state);
    void setSmsNotificationEnable(boolean state);
    String getName();
    String getEmail();
    String getPhoneNumber();
}
