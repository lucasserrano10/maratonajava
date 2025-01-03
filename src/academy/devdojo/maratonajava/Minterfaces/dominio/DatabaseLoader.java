package academy.devdojo.maratonajava.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }


}
