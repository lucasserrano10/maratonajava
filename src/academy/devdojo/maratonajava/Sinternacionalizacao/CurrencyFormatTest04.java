package academy.devdojo.maratonajava.Sinternacionalizacao;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest04 {
    public static void main(String[] args) {
            Locale localePT = new Locale("pt", "BR");
            Locale localeJP = Locale.JAPAN;
            Locale localeUK = Locale.UK;
            Locale localeIT = Locale.ITALY;
            NumberFormat[] nfmt = new NumberFormat[4];
            nfmt[0] = NumberFormat.getCurrencyInstance(localeIT);
            nfmt[1] = NumberFormat.getCurrencyInstance(localePT);
            nfmt[2] = NumberFormat.getCurrencyInstance(localeJP);
            nfmt[3] = NumberFormat.getCurrencyInstance(localeUK);
            double valor = 10_000.2130;

            for (NumberFormat numberFormat : nfmt) {
                System.out.println(numberFormat.format(valor));
            }
    }
}
