package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(2025, Month.AUGUST, 6); // ou escrevemos e usamos o parse
        LocalTime time = LocalTime.of(13,30,0);
        System.out.println(date + " - " + time);
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);
    }
}
