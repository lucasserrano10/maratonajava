package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        // essa diferente da duration não aceita LocalDateTime
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now,nowAfterTwoYears);
        System.out.println(p1);
        // ele mostra de uma diferente forma, o console exibe P2Y7D (P -> PERIOD, Y -> YEARS, D -> DAYS)
        Period p2 = Period.ofDays(365);
        Period p3 = Period.ofYears(23);
        System.out.println(p2);
        System.out.println(p3);
        // porem mesmo que colocamos 23 years ele nao retorna a quantidade de meses nem dias
        // para resolver isso temos que usar uma classe chamada Chrono unit, em outra classe
    }
}
