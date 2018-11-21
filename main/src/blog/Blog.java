package blog;

import blog.subscriber.Observable;
import blog.subscriber.Observer;

import java.util.LinkedList;
import java.util.List;

public class Blog implements Observable {
    List<Observer> blogSubscribers = new LinkedList<>();
    private final String blogName;

    public Blog(String blogName) {
        this.blogName = blogName;
    }

    @Override
    public void addObserver(Observer observer) {
        blogSubscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        blogSubscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        blogSubscribers.forEach(Observer::update);
    }

    public void publishNewArticle(String articleName) {
        System.out.println(String.format("Publish new article on blog %s about %s", blogName, articleName));
        notifyObservers();
    }
}
