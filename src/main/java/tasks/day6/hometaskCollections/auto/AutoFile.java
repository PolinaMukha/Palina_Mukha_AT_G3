package main.java.tasks.day6.hometaskCollections.auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AutoFile {
    public static void write(String file) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        Set<String> autoSet = new HashSet<>();
        String auto = "Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди";
        String[] strNew = auto.split(" ");
        //String [] strNew = auto.replaceAll("\\\\s*,\\\\s*", " ");

        Iterator<String> iterator = autoSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


/*        for (String aut : strNew) {
            autoSet.add(aut);
            out.write(String.valueOf(autoSet));
            //String aut = String.valueOf(autoSet + "-");
            //out.write(String.valueOf(autoSet));
        }
        out.close();

        Iterator<String> iterator = autoSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        }
    }
}
