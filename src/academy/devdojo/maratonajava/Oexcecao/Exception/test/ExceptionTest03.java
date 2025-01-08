package academy.devdojo.maratonajava.Oexcecao.Exception.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) throws IOException {
            criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IIOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IIOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
