package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class SubWindow implements Component{

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
    public void draw() {
        for(Component component : children){
            component.draw();
        }
    }
}
