package main.java.project.liquid;

/*
SparklingWater:
------ наследуется от Water
------ содеждит приватные поля boolean isOpened, Bubble[] bubbles
------ содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
------ есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
------ есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
------ есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и
       в случае, если она открыта запускает метод degas()
------ есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета
       10 + 5 * температура_воды
------ есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
------ каждый метод должен содержать сообщение о том, что он делает, например:
       System.out.printf("Warming water to: %s", temperature).println();
------ сообщения должны быть написаны 1-й строкой System.out.print* (пример см. строкой выше)

 */

import main.java.project.burbolka.Bubble;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(boolean isOpened){
        this.isOpened = isOpened;
    }

    private void pump(Bubble[] bubbles){ //который сетает массив из пузырьков в воду
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i] = new Bubble("oxygen");
        }
        System.out.println("BubblesMassive" + bubbles.length);
    }

    public void setOpened(boolean isOpened){ //который меняет состояние воды на "открытое"
        System.out.println();
    }

    private void isOpened(){
        //water.degas();
        System.out.println();
        //который в новом потоке проверят состояние воды на "открытость" и
        //       в случае, если она открыта запускает метод degas()
    }

    private void degas(){
        System.out.println();
        //который каждую секунду выпускает по партии пузырьков из рассчета
        //       10 + 5 * температура_воды
    }

    public boolean isSparkle(){
        return true;
    }
}



