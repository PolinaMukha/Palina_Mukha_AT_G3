package main.java.tasks.day5.coreTask.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ChainFiles {
    public static void write(String file) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        int[] arrayNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(100);
            int number = arrayNumbers[i];
            String str = String.valueOf(number + " ");
            out.append(str);
        }
        out.close();
    }
}

