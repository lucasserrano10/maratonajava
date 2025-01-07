package academy.devdojo.maratonajava.Oexcecao.Exception.test;

public class ExceptionTest02 {
    public static void main(String[] args) {
        int dividir = divisao(4,0);
        System.out.println(dividir);
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new RuntimeException("Argumento Ilegal, Não pode ser 0");
        }
        return a/b;
    }

}
