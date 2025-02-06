package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
    }

}
