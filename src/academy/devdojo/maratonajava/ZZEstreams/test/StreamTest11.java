package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.DRAMA),
            new LightNovel("Violet Evergarden", 5.99,Category.ROMANCE),
            new LightNovel("No game No life", 2.99, Category.FANTASY)
    ));


    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case  DRAMA: drama.add(lightNovel); break;
                case  FANTASY: fantasy.add(lightNovel); break;
                case  ROMANCE: romance.add(lightNovel); break;
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);

        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
