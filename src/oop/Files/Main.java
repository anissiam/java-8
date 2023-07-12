package oop.Files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("firstFile.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        file.delete();


    }
}
