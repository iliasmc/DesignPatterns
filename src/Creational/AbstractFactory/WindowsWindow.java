package Creational.AbstractFactory;

public class WindowsWindow implements Window{

    @Override
    public void renderWindow() {
        System.out.println("Windows window rendered");
    }
}
