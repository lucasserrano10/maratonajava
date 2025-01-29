package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");
        fila.add("C");

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
