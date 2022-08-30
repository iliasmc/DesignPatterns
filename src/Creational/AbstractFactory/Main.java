package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = getFactory();
        Window window = factory.createWindow();
        Button button = factory.createButton();
        window.renderWindow();
        button.click();
    }

    private static AbstractFactory getFactory(){
        String os = System.getProperty("os.name");
        AbstractFactory factory;
        if(os.equals("Linux")){
            return new LinuxFactory();
        }else if(os.startsWith("Windows")){
            return new WindowsFactory();
        }else{
            return new MacOsFactory();
        }
    }
}
