package academy.devdojo.maratonajava.Qstrings.test;

public class UtilitariasStringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; // dentro da String Pool
        String nome2 = "Willian"; // Dentro da String Pool
        System.out.println(nome == nome2);
        String nome3 = new String("Willian"); // Uma referencia de objeto sozinha, fora do Pool de String
        System.out.println(nome2 == nome3);
    }
}
