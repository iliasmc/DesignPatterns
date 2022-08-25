package Structural.Decorator;

public class CoffeeLimitDecorator extends Decorator{

    private final int LIMIT = 3;
    private int coffeesOrdered;

    public CoffeeLimitDecorator(Coffee coffee) {
        super(coffee);
        coffeesOrdered = 0;
    }

    @Override
    public double getPrice(){
        if(coffeesOrdered < LIMIT){
            coffeesOrdered++;
            return super.getPrice();
        }else{
            return Double.MAX_VALUE;
        }
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", with a limit!";
    }
}
