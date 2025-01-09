package academy.devdojo.maratonajava.Qstrings.test;

public class UtilitariasStringTest02 {
    public static void main(String[] args) {
        String nome = " Luffy   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("y", "o"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,numeros.length()));
        System.out.println(numeros.substring(0,6));
        System.out.println(nome.trim()); // Corta os espaços em brancos
    }
}
