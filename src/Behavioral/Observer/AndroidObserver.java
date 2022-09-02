package Behavioral.Observer;

public class AndroidObserver implements Observer{
    @Override
    public void update(String notification) {
        System.out.println(notification + ", for android");
    }
}
