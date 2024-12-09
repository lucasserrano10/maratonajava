package academy.devdojo.maratonajava.introducao;

public class Aula12Repeticao {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 100
        // quando chegar no 25 parar
        int i = 0;
        while(i <=1000){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
            if(i == 25){
                break;
            }
        }
    }
}
