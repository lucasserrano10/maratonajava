package academy.devdojo.maratonajava.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Lucas", "Serrano", "Rocco", "Arthur");
        List<String> nomesUpperCase = map(nomes, String::toUpperCase);
        System.out.println(nomesUpperCase);
    }
    private static <T, R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T t: list){
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
