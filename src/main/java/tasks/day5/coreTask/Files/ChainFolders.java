package main.java.tasks.day5.coreTask.Files;
import java.io.File;
import java.io.IOException;

public class ChainFolders {

    public static void write(String folder) throws IOException {

        String dir = folder;
        File file = new File(dir);

        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }
    }
}
