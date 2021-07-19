package pl.camp.it.generics;

public class Box<T> {
    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
