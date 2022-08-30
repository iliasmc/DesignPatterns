package Creational.AbstractFactory;

public class MacOsButton implements Button{

    @Override
    public void click() {
        System.out.println("MacOs button has been clicked");
    }
}
