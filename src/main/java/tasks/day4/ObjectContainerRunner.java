package main.java.tasks.day4;

public class ObjectContainerRunner {

    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();
        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
            objectContainer.add("Apple, Banana, Strawberry");
        }
        System.out.println(objectContainer + ".created!");

        for (int i = 0; i < 10; i++) {
            System.out.println(objectContainer.removeLast());
        }

        while (!objectContainer.isEmpty()) {
            Object object = objectContainer.removeLast();
            if (object instanceof Integer) {
                int integer = ((Integer) object);
                System.out.println("Number" + integer + "removed.");
            }
        }
    }
}
