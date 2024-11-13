package oop;

import java.util.Objects;

public class Foo {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Foo)) return false;
        Foo foo = (Foo) o;
        return size == foo.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
