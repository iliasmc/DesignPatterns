package Creational.AbstractFactory;

public class LinuxWindow implements Window {

    @Override
    public void renderWindow() {
        System.out.println("Linux window rendered");
    }
}
