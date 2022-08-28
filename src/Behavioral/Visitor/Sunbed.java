package Behavioral.Visitor;

public class Sunbed implements Element {

    private int cost = 5;
    private int ageInYears;

    public Sunbed(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public int getCost() {
        return cost;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
