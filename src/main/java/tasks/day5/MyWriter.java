package main.java.tasks.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    public static void write(String text) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(text));
        out.write(text);
        out.close();
    }
}
