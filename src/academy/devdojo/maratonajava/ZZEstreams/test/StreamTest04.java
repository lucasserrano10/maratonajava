package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> developers = List.of("Lucas", "William","Edcarlos","João");
        List<String> designers = List.of("Catarina", "Duda", "Isabela", "Joana");
        devdojo.add(designers);
        devdojo.add(developers);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----");

        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
