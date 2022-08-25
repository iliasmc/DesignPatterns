package Structural.Decorator;

public class MilkCoffeeDecorator extends Decorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice(){
        return super.getPrice()  + 0.5;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", with milk!";
    }
}
