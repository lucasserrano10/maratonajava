package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Pokemon", 4), new Anime("Berzerk", 2), new Anime("One piece", 123)));
//        Collections.sort(anime, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(anime, AnimeComparators::compareByTitle);
        System.out.println(anime);
    }
}
