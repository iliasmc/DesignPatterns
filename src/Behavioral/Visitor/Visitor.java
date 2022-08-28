package Behavioral.Visitor;

public interface Visitor {
    void visit(Sunbed sunbed);
    void visit(Table table);
    void visit(Chair chair);
}
