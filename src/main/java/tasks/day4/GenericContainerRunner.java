package main.java.tasks.day4;

public class GenericContainerRunner {
    public static void main(String[] args) {
        GenericContainer<Integer> objectContainer = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
        }
        System.out.println(objectContainer + ".created!");
        while (!objectContainer.isEmpty()) {
            Object object = objectContainer.removeLast();
            int integer = objectContainer.removeLast();
            System.out.println("Number" + integer + "removed.");
        }
    }
}
