package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Pokemon", 4), new Anime("Berzerk", 2), new Anime("One piece", 123)));
        anime.sort(animeComparators::compareByEpisodiosNonstatic);
        System.out.println(anime);
    }
}
