package com.epam.infohandling.model;

public interface Component {
    void operation();
    void add(Component c);
    void remove(Component c);
    Object getChild (int getIndex);

}
