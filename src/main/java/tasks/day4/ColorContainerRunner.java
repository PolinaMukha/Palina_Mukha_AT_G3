package main.java.tasks.day4;

public class ColorContainerRunner {
    public void printStringColor(String color) {
        if (color.equals(ColorContainer.RED.getColor())) {
            System.out.println(ColorContainer.RED.getColor());
        } else if (color.equals(ColorContainer.BLUE.getColor())) {
            System.out.println(ColorContainer.BLUE.getColor());
        } else if (color.equals(ColorContainer.GREEN.getColor())) {
            System.out.println(ColorContainer.GREEN.getColor());
        } else if (color.equals(ColorContainer.YELLOW.getColor())) {
            System.out.println(ColorContainer.YELLOW.getColor());
        } else if (color.equals(ColorContainer.PURPLE.getColor())) {
            System.out.println(ColorContainer.PURPLE.getColor());
        }
    }
    static private void printNumber(String color) {
    }
}
