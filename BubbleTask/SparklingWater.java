package BubbleTask;

/*
- создать класс SparklingWater, являющийся дочерним Water
- у газировки есть пузырьки
- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
 */

public class SparklingWater extends Water {


    private Bubble[] bubbles;

    public SparklingWater(double volume){
        super("blue", true, "sweet", 10);
        this.bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i] = new Bubble("oxygen");
        }
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i].burst();
        }
    }

}



