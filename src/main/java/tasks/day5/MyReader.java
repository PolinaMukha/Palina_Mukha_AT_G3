package main.java.tasks.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {
    public static void read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename)); //parametrization
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
