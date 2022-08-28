package Behavioral.Visitor;

public class Chair implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
