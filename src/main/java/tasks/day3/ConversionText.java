package main.java.tasks.day3;

/*
2.2 найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль
 */

public class ConversionText {
    public void ConvertTextWithNumbers() {

        String phrase = "ABC895 mdinvdv 89ioioi 88 kiojo";
        String phraseOnlyNumbers = phrase.replaceAll("[^0-9]", "");
        System.out.println(phraseOnlyNumbers);

        String[] stringDigits = phraseOnlyNumbers.split("");
        for (int i = 0; i < stringDigits.length; i++) {
            //System.out.print(stringDigits[i]);
        }

        int[] intDigits = new int[stringDigits.length];
        for (int i = 0; i < stringDigits.length; i++) {
            intDigits[i] = Integer.parseInt(String.valueOf(intDigits[i]));
            System.out.println(stringDigits[i]);
        }
    }
}




