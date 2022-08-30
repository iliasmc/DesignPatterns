package Creational.AbstractFactory;

public class MacOsFactory implements AbstractFactory{
    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }

    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
