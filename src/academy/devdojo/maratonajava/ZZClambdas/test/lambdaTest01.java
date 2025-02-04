package academy.devdojo.maratonajava.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class lambdaTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Lucas", "Serrano", "Rocco", "Quebão");
        forEach(nomes, nome -> System.out.println(nome));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
