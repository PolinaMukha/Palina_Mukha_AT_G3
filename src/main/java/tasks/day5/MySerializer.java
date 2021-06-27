package main.java.tasks.day5;

import java.io.*;

public class MySerializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write("t.tmp");
        read("t.tmp");

    }

    public static void write(String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("Marta", 35, 48, 162));
        oos.close();
    }

    public static void read(String text) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(text);
        ObjectInput ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);
    }
}
