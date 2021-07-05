package main.java.tasks.day6.hometaskCollections.figures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FigureFile{

    public static void write(String file) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        String[] figures = {"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        List<String> list = Arrays.asList(figures);
        System.out.println(list);

        for (String f : figures) {
            String str = String.valueOf(figures + "-");
            out.write(String.valueOf(figures));
        }
        out.close();

        int counter = 0;
        for (String s : figures) {
            if (!s.contains("и")) {
                counter++;
            }

        }
        System.out.println(counter);

        figures.add(3, "Треугольник");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
    }
}
