package Structural.Decorator;

public abstract class Decorator implements Coffee{

    private Coffee coffee;

    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getPrice(){
        return coffee.getPrice();
    }

    @Override
    public String getDescription(){
        return coffee.getDescription();
    }

}
