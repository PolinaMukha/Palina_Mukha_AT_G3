package main.java.tasks.day6;

import java.util.HashMap;
import java.util.Map;

public class NewCollection6 {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<Integer, String>();
        String str = "мама мыла раму";
        String[] strNew = str.split(" ");

        for (int i = 0; i < strNew.length; i++) {
            words.put(i, strNew[i]);
        }

        for (int i : words.keySet()) {
            System.out.println(i);
        }

        for (String s : words.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


