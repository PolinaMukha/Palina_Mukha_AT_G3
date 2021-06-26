package main.java.tasks.day4;

public class ObjectContainer {

    int counter;
    private Object[] objects = new Object[10];

    public void add(Object o) {
        //Object t = null;
        //for (int i = 0; i < objects.length; i++) {}
        if (counter < objects.length) {
            objects[counter] = o;
            counter++;
        }
        //return t;
    }

    public Object removeLast() {
        Object p = null;
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



