package Behavioral.Visitor;

public class Table implements Element {

    private boolean isNew;

    public Table(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
