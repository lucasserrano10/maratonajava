package academy.devdojo.maratonajava.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Fazendo Checagem de permissão !");
    }
}
