package main.java.tasks.day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewCollection3 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String str = "мама мыла раму мыла";
        String[] strNew = str.split(" ");

        for (String s : strNew) {
            mySet.add(s);
        }

        for (String sNew : mySet) {
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
