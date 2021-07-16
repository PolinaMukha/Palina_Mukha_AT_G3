package main.java.project.boxing;

public class VesselBox<T extends Vessel> {
    private T[] objects;
    private int counter;

    public VesselBox() {
        objects = (T[]) new Object[9];
        objects = (T[]) new Object[25];
        objects = (T[]) new Object[36];
    }

    ///OR

    private T[] vesselBox1 = (T[]) new Object[9];
    private T[] vesselBox2 = (T[]) new Object[25];
    private T[] vesselBox3 = (T[]) new Object[36];

}
