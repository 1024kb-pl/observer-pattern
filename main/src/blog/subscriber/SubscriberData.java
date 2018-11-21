package blog.subscriber;

public class SubscriberData implements Subscriber {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private boolean isEmailNotificationEnable = true;
    private boolean isSmsNotificationEnable = true;
    private boolean isPushNotificationEnable = true;


    public SubscriberData(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailNotificationEnable(boolean emailNotificationEnable) {
        isEmailNotificationEnable = emailNotificationEnable;
    }

    public void setSmsNotificationEnable(boolean smsNotificationEnable) {
        isSmsNotificationEnable = smsNotificationEnable;
    }

    public void setPushNotificationEnable(boolean pushNotificationEnable) {
        isPushNotificationEnable = pushNotificationEnable;
    }

    @Override
    public boolean isEmailNotificationEnabled() {
        return isEmailNotificationEnable;
    }

    @Override
    public boolean isPushNotificationEnabled() {
        return isPushNotificationEnable;
    }

    @Override
    public boolean isSmsNotificationEnabled() {
        return isSmsNotificationEnable;
    }
}
