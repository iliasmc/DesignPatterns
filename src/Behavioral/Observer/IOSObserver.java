package Behavioral.Observer;

public class IOSObserver implements Observer{

    @Override
    public void update(String notification) {
        System.out.println(notification + ", for ios");
    }
}
