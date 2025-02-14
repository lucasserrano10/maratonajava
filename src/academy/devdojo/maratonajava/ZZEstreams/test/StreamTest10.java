package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;
import jdk.swing.interop.LightweightContentWrapper;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest10 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99)
    ));

    public static void main(String[] args) {
//        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());

        // Porém, tudo isso não é o verdadeiro poder do Collectors, pois podemos fazer mais legivel com stream normal

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        // DoubleSummaryStatistics{count=4, sum=21,960000, min=2,990000, average=5,490000, max=8,990000}


    }
}
