package main.java.tasks.day6;

import java.util.ArrayList;
import java.util.List;

public class NewCollection {

    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        String str= "мама мыла раму";
        String[] strNew = str.split(" ");

        for (String s: strNew) {
            System.out.println(s);
            myList.add(s);
        }

        for (String sNew: myList) {
            System.out.println(sNew);
        }

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
