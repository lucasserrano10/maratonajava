package academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternMatcherTest03 {
    public static void main(String[] args) {
        // meta caracteres -> \d = todos os digitos(numeros) ---c
        // \D = Tudo oque nao for digito até caracteres especiais
        // \s = Espacos em brancos
        // \S = todos os caracteres excluindo os brancos
        // \w = Tudo que for de a-z ou A-Z, dígitos, e underscore___
        // \W = Tudo que nao for de a-z ou A-Z, dígitos, e underscore___
        // [] = Podemos colocar os caracteres que queremos dentro, e ele buscaria não a sequencia mas o caracter em si
        // ? Zero ou Uma ocorrência
        // * Zero ou mais ocorrências
        // + Uma ou Mais
        // {n,m} de n até m
        // ()
        // | o(v/c)0 -> ovo oco
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
