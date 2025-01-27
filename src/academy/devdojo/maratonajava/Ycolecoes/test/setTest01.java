package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L,"Pokemon", 9.5,4));
        mangas.add(new Manga(2L,"Berserk", 9.99,0));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9,2));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
