package main.java.tasks.day5.coreTask.Files;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException{
        //ListOfFiles.read("C:/Repositories/Palina_Mukha_AT_G3/pictures/");
        ChainFolders.write("C:/Repositories/Palina_Mukha_AT_G3/pictures/p1/p2/p3/p4/");
        ChainFiles.write("C:/Repositories/Palina_Mukha_AT_G3/pictures/p1/p2/p3/p4/fileP1.txt");
        ChainFiles.write("C:/Repositories/Palina_Mukha_AT_G3/pictures/p1/p2/p3/p4/fileP2.txt");
    }
}
