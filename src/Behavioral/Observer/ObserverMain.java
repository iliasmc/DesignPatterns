package Behavioral.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        NewsAgency news = new BBCNews();

        Observer androidOne = new AndroidObserver();
        Observer androidTwo = new AndroidObserver();
        Observer ios = new IOSObserver();

        news.addObserver(androidOne);
        news.addObserver(androidTwo);
        news.addObserver(ios);

        news.addArticle("Observer pattern");
    }
}
