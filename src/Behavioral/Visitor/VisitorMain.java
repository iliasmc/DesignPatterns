package Behavioral.Visitor;

public class VisitorMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        BookEquipmentVisitor bookEquipmentVisitor = new BookEquipmentVisitor();
        restaurant.accept(bookEquipmentVisitor);
        restaurant.accept(bookEquipmentVisitor);

        LoggerVisitor loggerVisitor = new LoggerVisitor();
        restaurant.accept(loggerVisitor);


    }
}
