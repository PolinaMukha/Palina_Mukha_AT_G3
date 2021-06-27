package main.java.tasks.day4;

public class PrinterColor {

    static private void printColor(String color){
        String aColor = color;
        switch (aColor){
            case (Constant.RED):
                System.out.println(Constant.RED);
                break;
            case (Constant.BLUE):
                System.out.println(Constant.BLUE);
                break;
            case (Constant.GREEN):
                System.out.println(Constant.GREEN);
                break;
            case (Constant.YELLOW):
                System.out.println(Constant.YELLOW);
                break;
            case (Constant.PURPLE):
                System.out.println(Constant.PURPLE);
                break;
        }
    }
}
