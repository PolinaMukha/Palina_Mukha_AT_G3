package BubbleTask;

/*
- создать абстрактный класс Water
- у воды есть такие характеристики: цвет, прозрачность, запах, температура
 */

public abstract class Water {
    private String color;
    private boolean transparency;
    private String smell;
    private double temperature;

    public Water(String color, boolean transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }
}