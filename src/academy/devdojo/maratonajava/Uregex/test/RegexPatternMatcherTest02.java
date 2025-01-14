package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternMatcherTest02 {
    public static void main(String[] args) {
        // meta caracteres -> \d = todos os digitos(numeros) ---c
        // \D = Tudo oque nao for digito até caracteres especiais
        // \s = Espacos em brancos
        // \S = todos os caracteres excluindo os brancos
        // \w = Tudo que for de a-z ou A-Z, dígitos, e underscore___
        // \W = Tudo que nao for de a-z ou A-Z, dígitos, e underscore___
        String regex = "\\W";
        String texto = "ab2ab3ab5";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto : " + texto);
        System.out.println("indice: 0123456789123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() +" " + matcher.group() + "\n");
        }
    }
}
