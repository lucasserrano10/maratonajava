package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
