package BubbleTask;

/*
 создать класс Bubble
- у пузырька должен быть обьем, газовый состав
- он должен уметь лопаться с выводом в консоль «Cramp!»
- обьем пузырька постоянный и равен 0.3 мм2, а газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса
 */

public class Bubble {
    public static final double volume = 0.3;
    private String components; // газовый состав


    public Bubble(String components) {
        this.components = components;
    }

    public void burst() {
        System.out.println("Cramp!");
    }
}
