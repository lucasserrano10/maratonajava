package academy.devdojo.maratonajava.Dconstrutores.test;


import academy.devdojo.maratonajava.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bob Esponja","TV", 54, "Comédia", "Ilumination");
        Anime anime2 = new Anime("Avengers", "TV", 76, "AÇÃO");
        anime.imprime();
        anime2.imprime();
    }
}
