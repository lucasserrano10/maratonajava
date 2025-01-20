package academy.devdojo.maratonajava.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File("/Users/lucasserrano/IdeaProjects/maratona-java/pasta/arquivo.txt");
        boolean isFileCreated = false;
        try {
            isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(isFileCreated);
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);
    }
}
