package academy.devdojo.maratonajava.Wnio.test;


import java.nio.file.Path;
import java.nio.file.Paths;

public class pathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/lucasserrano/IdeaProjects/maratona-java/file.txt");
        Path p2 = Paths.get("/Users/lucasserrano/IdeaProjects/maratona-java/file.txt");
        Path p3 = Paths.get("/Users/lucasserrano/IdeaProjects/maratona-java/file.txt");
        Path p4 = Paths.get("/Users/lucasserrano/IdeaProjects/maratona-java/file.txt");
        System.out.println(p1.getFileName());
    }
}
