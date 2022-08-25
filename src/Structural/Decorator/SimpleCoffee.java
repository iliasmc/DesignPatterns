package Structural.Decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public double getPrice() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Basic standard coffee";
    }
}
