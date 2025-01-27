package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L,"Pokemon", 9.5,4));
        mangas.add(new Manga(2L,"Berserk", 9.99,0));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9,2));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5,0));


        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }

        // exemplo da mesam funcionalidade, porém com progrmação funcional

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
