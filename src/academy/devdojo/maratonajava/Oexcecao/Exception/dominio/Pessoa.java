package academy.devdojo.maratonajava.Oexcecao.Exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa...");
    }
}
