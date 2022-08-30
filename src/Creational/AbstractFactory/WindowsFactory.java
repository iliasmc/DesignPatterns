package Creational.AbstractFactory;

public class WindowsFactory implements AbstractFactory{
    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
