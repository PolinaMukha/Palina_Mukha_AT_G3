package main.java.tasks.day4;

public enum Ecolor {
    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3),
    YELLOW("yellow", 4),
    PURPLE("purple", 5);

    String color;
    int hex;

    Ecolor(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }

    public static Ecolor byHex(int hex) {
        switch (hex) {
            case 2:
                return BLUE;
            case 3:
                return GREEN;
            default:
                return RED;
        }
    }
}
