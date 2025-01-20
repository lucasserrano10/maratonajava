package academy.devdojo.maratonajava.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O devDojo é o melhor curso do BrasilSilsSilSil");
            bw.flush(); // O flush é usado para dar uma descarga e não deixar bytes para tras, as vezes em ambientes mais complexos é bom usar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
