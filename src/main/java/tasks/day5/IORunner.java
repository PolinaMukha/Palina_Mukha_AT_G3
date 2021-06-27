package main.java.tasks.day5;

import java.io.IOException;

public class IORunner {
    public static void main(String[] args) throws IOException {
        MyReader.read("file.txt");
        MyWriter.write("new_file3.txt");
        MyReader.read("new_file.txt");
        MyWriter.write("new_file2.txt");
    }
}
