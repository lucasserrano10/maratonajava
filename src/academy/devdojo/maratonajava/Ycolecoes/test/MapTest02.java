package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(5L,"Hellsing Ultimate", 19.9,0);
        Manga manga2 = new Manga(1L,"Pokemon", 9.5,4);
        Manga manga3 = new Manga(2L,"Berserk", 9.99,0);
        Manga manga4 = new Manga(3L,"Attack on Tittan", 15.9,2);
        Manga manga5 = new Manga(4L,"Dragon Ball Z", 4.5,0);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga3);
        consumidorManga.put(consumidor2,manga4);

        for(Map.Entry<Consumidor,Manga> e : consumidorManga.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
