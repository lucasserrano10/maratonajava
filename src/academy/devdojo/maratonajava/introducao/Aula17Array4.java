package academy.devdojo.maratonajava.introducao;

public class Aula17Array4 {
    public static void main(String[] args) {
        // Formas de declarar um array
        int [] numeros1 = new int[3];
        int [] numeros2 = new int[]{1,2,3,4,5};
        int [] numeros3 = {1,2,3,4,5};
        // Além do for normal, também usamos o ForEach
        // Como se a variavel num fosse uma referencia que vai passando pelo array
        // por isso o num precisar ter o mesmo tipo do array numeros3
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
