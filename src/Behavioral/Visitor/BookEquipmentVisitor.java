package Behavioral.Visitor;

import java.util.HashSet;
import java.util.Set;

public class BookEquipmentVisitor implements Visitor {

    private Set<Element> alreadyBooked;

    public BookEquipmentVisitor() {
        this.alreadyBooked = new HashSet<>();
    }

    @Override
    public void visit(Sunbed sunbed) {
        if(!alreadyBooked.contains(sunbed)) {
            System.out.println("Booked sunbed");
            alreadyBooked.add(sunbed);
        }else{
            System.out.println("Already booked this sunbed");
        }
    }

    @Override
    public void visit(Table table) {
        if(!alreadyBooked.contains(table)) {
            System.out.println("Booked table");
            alreadyBooked.add(table);
        }else{
            System.out.println("Already booked this table");
        }
    }

    @Override
    public void visit(Chair chair) {
        if(!alreadyBooked.contains(chair)) {
            System.out.println("Booked chair");
            alreadyBooked.add(chair);
        }else{
            System.out.println("Already booked this chair");
        }
    }
}
