package Behavioral.Visitor;

public class LoggerVisitor implements Visitor {
    @Override
    public void visit(Sunbed sunbed) {
        System.out.println("Logged a sunbed");
    }

    @Override
    public void visit(Table table) {
        System.out.println("Logged a table");
    }

    @Override
    public void visit(Chair chair) {
        System.out.println("Logged a chair");
    }
}
