package main.java.tasks.day4;

public class GenericContainer<T> {
    private T[] objects;
    private int counter;

    public GenericContainer(){
        objects = (T[]) new Object[10];
        counter = 0;
    }

    public void add(T o) {
        if (counter < 10) {
            objects[counter++] = o;
        }
    }

    public T removeLast() {
        T p = null;
        if (counter > 0) {
            p = objects[counter - 1];
            objects[counter - 1] = null;
            counter--;
        }
        return p;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
