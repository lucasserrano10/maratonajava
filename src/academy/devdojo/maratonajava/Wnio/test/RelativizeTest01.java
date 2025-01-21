package academy.devdojo.maratonajava.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.Java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
        // Vai mostrar basicamente oque falta para chegarmos aonde queremos

    }
}
