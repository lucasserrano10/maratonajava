package academy.devdojo.maratonajava.Oexcecao.Exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 2...");
    }
}
