package academy.devdojo.maratonajava.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta2");
        if(Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }else{
            System.out.println("Ja existe !");
        }
;    }
}
