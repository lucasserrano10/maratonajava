package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.ZZEstreams.dominio.Promotion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.DRAMA),
            new LightNovel("Violet Evergarden", 5.99,Category.ROMANCE),
            new LightNovel("No game No life", 2.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(lightNovel ->
                        lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(collect);
    }
}
