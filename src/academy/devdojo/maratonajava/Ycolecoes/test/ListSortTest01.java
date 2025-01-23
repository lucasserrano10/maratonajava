package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> times = new ArrayList<>();
        times.add("Corinthians");
        times.add("Real Madrid");
        times.add("Barcelona");
        times.add("Cruzeiro");
        times.add("Agua Santa");

        Collections.sort(times);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.3);
        dinheiros.add(21.4);
        dinheiros.add(133.1);

        Collections.sort(dinheiros.reversed());

        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }

        System.out.println("------");

        for(String time : times){
            System.out.println(time);
        }
    }
}
