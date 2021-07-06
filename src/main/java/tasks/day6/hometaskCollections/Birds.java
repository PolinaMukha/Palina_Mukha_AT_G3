package main.java.tasks.day6.hometaskCollections;

import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        String[] birds = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        List<String> list = Arrays.asList(birds);

        String[] vowels = {"a", "e", "i", "o", "u"};
        List<String> listV = Arrays.asList(vowels);

        for (String b : birds) {
            System.out.println("--" + b + "--");
        }

        //TODO How to compare two lists
        //letter = а, у, о, ы, и, э, я, ю, ё, е
        int vCounter = 0;
        for (int i = 0; i < birds.length; i++) {
            //if(vowels.contains(letter)){
                vCounter++;
            }
        }
        //System.out.println(counter);
    }

