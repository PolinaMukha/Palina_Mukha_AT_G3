package main.java.tasks.day6.hometaskCollections.auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AutoFile {
    public static void write(String file) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        Set<String> autoSet = new HashSet<>();
        String auto = "Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди";
        String[] strNew = auto.split(" ");


        for (String aut : strNew) {
            autoSet.add(aut);
            out.write(String.valueOf(autoSet));
            //String aut = String.valueOf(autoSet + "-");
            //out.write(String.valueOf(autoSet));
        }
        out.close();
    }
}
