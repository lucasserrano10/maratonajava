package academy.devdojo.maratonajava.Ycolecoes.test;


import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortMangaById implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(2L,"Berserk", 9.99));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5));

        Collections.sort(mangas);
        // o própio Java que chama o Comparable que usamos na classe Manga

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        System.out.println("---------");

        // Comparator
        Collections.sort(mangas, new SortMangaById());
        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
