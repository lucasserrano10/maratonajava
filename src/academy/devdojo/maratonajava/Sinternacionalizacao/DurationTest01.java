package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        // Tomar cuidado, pois a Duration não aceita segundos, pois LocalDate, não tem segundos !
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        Duration duration = Duration.between(now,nowAfterTwoYears);
        System.out.println(duration); // por hora, logo 2 anos, o console vai dar 17520H e uns segundos
    }
}
