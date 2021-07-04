package main.java.project.boxing;

/*
Bottle:
------ содеждит приватные поля double volume, SparklingWater water
------ содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков
       из рассчета 10000 на каждый литр
------ есть публичный метод void open(), который меняет состояние воды в "открытое"
       (приблизительно, как this.water.setOpened(true)
------ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
------ есть публичный метод SparklingWater getWater() возвращающий обьект воды
------ есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
 */


import main.java.project.interfaces.Containable;
import main.java.project.interfaces.Transformable;
import main.java.project.material.Material;
import main.java.project.substance.gasSubstance.Bubble;
import main.java.project.substance.liquidSubstance.SparklingWater;

public class Bottle extends Vessel implements Containable {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        this.water = water;//this.water.setOpened(true)
    }

    @Override
    public void close() {

    }

    public void warm(int temperature) {
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {

    }
/*    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }*/

/*    public void open() {
        water.degas();
    }*/
}
