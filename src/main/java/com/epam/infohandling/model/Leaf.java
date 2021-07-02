package com.epam.infohandling.model;

import java.util.Objects;

public class Leaf implements Component {
    private String value;

    public Leaf(String value) {
this.value = value;
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Object getChild(int getIndex) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Leaf)) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(value, leaf.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}