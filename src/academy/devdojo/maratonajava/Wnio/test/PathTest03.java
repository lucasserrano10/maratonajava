package academy.devdojo.maratonajava.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/willian");
        Path arquivo = Paths.get("dev/arquivo.txt"); // De exemplo, se não tiver nenhum dev no root
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
    }
}
