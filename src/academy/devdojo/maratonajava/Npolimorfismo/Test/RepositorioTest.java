package academy.devdojo.maratonajava.Npolimorfismo.Test;

import academy.devdojo.maratonajava.Npolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
