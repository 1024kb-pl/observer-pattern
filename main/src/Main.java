import blog.Blog;
import blog.subscriber.BlogSubscriber;
import blog.subscriber.SubscriberData;

public class Main {
    public static void main(String[] args) {
        Blog firstBlog = new Blog("1024kb.pl");
        Blog secondBlog = new Blog("google.pl");

        BlogSubscriber me = new BlogSubscriber(new SubscriberData("Kamil", "maniaq@1024kb.pl", "554-333-222"));
        BlogSubscriber pablo = new BlogSubscriber(new SubscriberData("Pablo", "pablo@1024kb.pl", "444-221-222"));

        firstBlog.addObserver(me);
        firstBlog.addObserver(pablo);

        secondBlog.addObserver(pablo);

        firstBlog.publishNewArticle("Interfejsy w Javie");
        firstBlog.publishNewArticle("Użycie HashMapy");
        secondBlog.publishNewArticle("Nowy algorytm SEO");
    }
}
