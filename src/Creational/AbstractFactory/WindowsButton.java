package Creational.AbstractFactory;

public class WindowsButton implements Button{

    @Override
    public void click() {
        System.out.println("Windows button has been clicked");
    }
}
