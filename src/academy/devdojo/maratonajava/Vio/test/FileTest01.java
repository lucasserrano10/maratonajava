package academy.devdojo.maratonajava.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        // Dentro de File existe diversos diretórios interessantes que retornam boolean
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created -> " + isCreated);
            System.out.println();
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted -> " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
