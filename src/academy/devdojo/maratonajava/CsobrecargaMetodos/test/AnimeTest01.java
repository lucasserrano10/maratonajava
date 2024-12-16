package academy.devdojo.maratonajava.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bob Esponja 2","TV", 87, "Comédia");
        anime.imprime();
    }
}
