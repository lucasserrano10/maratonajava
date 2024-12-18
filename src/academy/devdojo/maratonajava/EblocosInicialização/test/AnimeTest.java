package academy.devdojo.maratonajava.EblocosInicialização.test;

import academy.devdojo.maratonajava.EblocosInicialização.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for(int episodio : anime.getEpisodios()){
            System.out.print(episodio +  " ");
        }
    }
}
