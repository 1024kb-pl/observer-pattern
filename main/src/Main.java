import blog.Blog;
import blog.subscriber.BlogSubscriber;
import blog.subscriber.Subscriber;
import blog.subscriber.SubscriberData;

public class Main {
    public static void main(String[] args) {
        Blog firstBlog = new Blog("1024kb.pl");
        Blog secondBlog = new Blog("google.pl");

        Subscriber meSubsriber = new SubscriberData("Kamil", "maniaq@1024kb.pl", "554-333-222");
        Subscriber pabloSubsriber = new SubscriberData("Pablo", "pablo@1024kb.pl", "444-221-222");

        BlogSubscriber me = new BlogSubscriber(meSubsriber);
        BlogSubscriber pablo = new BlogSubscriber(pabloSubsriber);

        pabloSubsriber.setPushNotificationEnable(false);
        pabloSubsriber.setSmsNotificationEnable(false);
        meSubsriber.setEmailNotificationEnable(false);


        firstBlog.addObserver(me);
        firstBlog.addObserver(pablo);

        secondBlog.addObserver(pablo);

        firstBlog.publishNewArticle("Interfejsy w Javie");
        firstBlog.publishNewArticle("Użycie HashMapy");
        secondBlog.publishNewArticle("Nowy algorytm SEO");
    }
}
