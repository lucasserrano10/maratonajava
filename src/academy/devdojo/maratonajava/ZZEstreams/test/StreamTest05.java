package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> palavras = List.of("Goma", "Chave", "Celular", "Andar");
        String[] letras = palavras.get(0).split("");
        System.out.println(Arrays.toString(letras));

        List<String> letraporletra = palavras.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letraporletra);

    }
}
