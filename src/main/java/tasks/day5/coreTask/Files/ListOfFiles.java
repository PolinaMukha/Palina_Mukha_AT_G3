package main.java.tasks.day5.coreTask.Files;

import java.io.*;

public class ListOfFiles {
    public static void read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename)); //parametrization
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}