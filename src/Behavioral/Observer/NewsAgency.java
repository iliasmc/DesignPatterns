package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

abstract public class NewsAgency {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    abstract void addArticle(String article);

    abstract void removeArticle(String article);

    protected void notifyAll(String article){
        for(Observer observer : observers){
            observer.update(article);
        }
    }

}
