package com.epam.infohandling.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List <Component> components = new ArrayList<Component>();

    @Override
    public void operation() {
        System.out.println("Composite -> get composite operations");
        int size = components.size();
        for (Component component:components){
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        System.out.println("Component -> add component");
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        System.out.println("Component -> remove component");
        components.remove(component);
    }

    @Override
    public Object getChild(int index) {
        System.out.println("Component -> remove component");
        return components.get(index);
    }
}