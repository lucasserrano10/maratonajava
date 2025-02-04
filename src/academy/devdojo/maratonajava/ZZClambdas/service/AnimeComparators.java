package academy.devdojo.maratonajava.ZZClambdas.service;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByEpisodiosNonstatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}
