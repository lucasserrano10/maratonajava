package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        integers.stream().reduce(Integer::sum)
                .ifPresent(System.out::println);

        integers.stream().reduce(Integer::min)
                .ifPresent(System.out::println);


    }
}
