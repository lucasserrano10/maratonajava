package academy.devdojo.maratonajava.Rdate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana !");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.HOUR, 3);

        Date date = c.getTime();
        System.out.println(date);
    }
}
