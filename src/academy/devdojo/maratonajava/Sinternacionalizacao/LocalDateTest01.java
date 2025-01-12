package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2025, Month.JANUARY,10);
        LocalDate dataAgora = LocalDate.now();
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // se retornar True é um ano bisexto, caso contrário não é
        System.out.println(dataAgora);

    }
}
