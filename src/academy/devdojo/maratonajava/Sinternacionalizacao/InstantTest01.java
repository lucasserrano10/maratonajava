package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        // Com o Instant é retornado o valor Zulu Time, que comparado com São Paulo, são de 3 horas a menos
    }
}
