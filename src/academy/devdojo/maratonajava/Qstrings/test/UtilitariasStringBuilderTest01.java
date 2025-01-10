package academy.devdojo.maratonajava.Qstrings.test;

public class UtilitariasStringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat("DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" Dev Dojo");
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
    }
}
