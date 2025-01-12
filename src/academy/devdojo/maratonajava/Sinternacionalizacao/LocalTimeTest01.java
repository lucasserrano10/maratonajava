package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,30,30);
        LocalTime now = LocalTime.now();
        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
    }
}
