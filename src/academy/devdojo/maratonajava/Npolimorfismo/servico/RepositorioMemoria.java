package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em uma memória...");
    }
}
