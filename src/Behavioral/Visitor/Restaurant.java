package Behavioral.Visitor;

import java.util.List;

public class Restaurant implements Element{

    private List<Element> equipments = List.of(
            new Chair(),
            new Sunbed(5),
            new Sunbed(10),
            new Table(false)
    );

    public List<Element> getEquipments(){
        return equipments;
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element e : equipments){
            e.accept(visitor);
        }
    }
}
