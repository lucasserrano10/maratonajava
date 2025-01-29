package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L,"Pokemon", 9.5,4));
        mangas.add(new Manga(2L,"Berserk", 9.99,0));
        mangas.add(new Manga(3L,"Attack on Tittan", 15.9,2));
        mangas.add(new Manga(4L,"Dragon Ball Z", 4.5,0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
