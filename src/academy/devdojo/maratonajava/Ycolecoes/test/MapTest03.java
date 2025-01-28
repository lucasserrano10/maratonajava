package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(5L,"Hellsing Ultimate", 19.9,0);
        Manga manga2 = new Manga(1L,"Pokemon", 9.5,4);
        Manga manga3 = new Manga(2L,"Berserk", 9.99,0);
        Manga manga4 = new Manga(3L,"Attack on Tittan", 15.9,2);
        Manga manga5 = new Manga(4L,"Dragon Ball Z", 4.5,0);

        List<Manga> consumidor1List = List.of(manga1,manga2,manga3);
        List<Manga> consumidor2List = List.of(manga3,manga4,manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,consumidor1List);
        consumidorMangaMap.put(consumidor2,consumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.print(" <-" + entry.getKey().getNome() + "-> ");
            for(Manga manga: entry.getValue()){
                System.out.print(manga.getNome() + "  ");
            }
        }



    }
}
