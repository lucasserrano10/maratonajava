package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20230420",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter patternBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String padraoBR = LocalDate.now().format(patternBR);
        System.out.println("BR -> " + padraoBR);
        DateTimeFormatter patternEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String padraoEUA = LocalDate.now().format(patternEUA);
        System.out.println("EUA -> " + padraoEUA);
        DateTimeFormatter patternJP = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String padraoJP = LocalDate.now().format(patternJP);
        System.out.println("JAPÃO -> " + padraoJP);

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.FRANCE);
        String formatFranca = LocalDate.now().format(formatterFR);
        System.out.println(formatFranca);


    }
}
