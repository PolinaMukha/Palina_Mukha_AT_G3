package main.java.project.burbolka;

/*
Bubble:
------ содеждит приватные поля double volume = 0.3, String gas;
------ содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
------ есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
------ есть публичный метод double getVolume(), возвращающий обьем пузырька
 */

public class Bubble {
    private static final double volume = 0.3;
    private String gas;

    public Bubble(String gas){
        this.gas = "oxygen";
    }

    public void cramp(){
        System.out.println("Cramp!");
    }

    public double getVolume(){
        return volume;
    }
/*    public void burst() {
        System.out.println("Cramp!");
    }*/

}
