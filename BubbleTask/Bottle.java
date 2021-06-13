package BubbleTask;

/*
- создать класс Bottle
- у него есть обьем
- есть вода
- есть метод open(), который вызывает метод degas() в газировке
 */


public class Bottle {
    private double volume;
    private SparklingWater water;


    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public void open() {
        water.degas();
    }

}
