package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(2L,"Berserk", 9.99));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5));

//        Collections.sort(mangas);

        mangas.sort(new SortMangaById());

        for(Manga manga : mangas){
            int i = 0;
            System.out.println(manga + " - " + i);
        }

        Manga mangaToSearch = new Manga(4L,"Dragon Ball Z", 4.5);

        System.out.println(Collections.binarySearch(mangas,mangaToSearch,new SortMangaById()));

    }
}
