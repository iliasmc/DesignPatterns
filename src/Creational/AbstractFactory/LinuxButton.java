package Creational.AbstractFactory;

public class LinuxButton implements Button{

    @Override
    public void click() {
        System.out.println("Linux button has been clicked");
    }
}
