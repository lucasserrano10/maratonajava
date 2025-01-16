package academy.devdojo.maratonajava.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O devDojo é o melhor curso do BrasilSilsSilSil");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
