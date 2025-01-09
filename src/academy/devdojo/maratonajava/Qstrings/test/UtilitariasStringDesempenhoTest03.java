package academy.devdojo.maratonajava.Qstrings.test;

public class UtilitariasStringDesempenhoTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Gasto com String " + (fim-inicio));
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
}
