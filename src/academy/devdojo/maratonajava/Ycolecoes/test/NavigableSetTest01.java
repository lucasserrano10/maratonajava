package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>();
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L,"Pokemon", 9.5,4));
        mangas.add(new Manga(2L,"Berserk", 9.99,0));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9,2));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5,0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga yakusoku = new Manga(1L,"Yuyu Hakusho", 9.5, 5);

        // lower vai trazer o menor <
        // floor vai trazer o mesmo elemento ou um a abaizo<=
        // higher vai trazer o maior
        // ceiling vai trazer o mesmo elemento ou um a cima
        System.out.println("--------");
        System.out.println(mangas.lower(yakusoku));// o lower vai procurar um valor menor do que o preco do yakusoku, isso porque estamos usandon preco
        System.out.println(mangas.floor(yakusoku));
        System.out.println(mangas.higher(yakusoku));
        System.out.println(mangas.ceiling(yakusoku));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

//        System.out.println(mangas.size());
//        System.out.println(mangas.pollLast());
//        System.out.println(mangas.size());
    }
}
