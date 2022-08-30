package Creational.AbstractFactory;

public class LinuxFactory implements AbstractFactory{
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
