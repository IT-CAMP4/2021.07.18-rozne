package pl.camp.it.generics;

import java.util.ArrayList;
import java.util.List;

public class LIFOQueue<T> {
    List<T> list = new ArrayList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if(list.size() == 0){
            return null;
        }
        T element = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return element;
    }
}
