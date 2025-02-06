package academy.devdojo.maratonajava.ZZEstreams.test;

// 1. Order LightNovelByTitle
// 2. Retrieve the first 3 titles light novel with price less than 4

import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice() <= 4){
                lightNovel.getTitle();
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
