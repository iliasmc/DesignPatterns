package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> children = new ArrayList<>();

    public void add(Component component){
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
    }

    public List<Component> getChildren(){
        return children;
    }

    @Override
    public void operation() {
        System.out.println("Composite node operation");
    }
}
