package main.java.tasks.day6.hometaskCollections;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String e : elements) {
        }
        System.out.print(elements + " ");
    }
}
