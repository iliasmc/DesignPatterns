package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        printCoffeeInformation(c);

        c = new MilkCoffeeDecorator(c);
        printCoffeeInformation(c);

        c = new CoffeeLimitDecorator(c);
        printCoffeeInformation(c);
        printCoffeeInformation(c);
        printCoffeeInformation(c);
        printCoffeeInformation(c);
    }

    private static void printCoffeeInformation(Coffee c){
        System.out.println("Price: " + c.getPrice() + "\n" + "Description: " + c.getDescription() + "\n");
    }
}
