package academy.devdojo.maratonajava.introducao;

public class Aula14Array {
    public static void main(String[] args) {
        // Array
        // Array são considerados objetos em Java
        int [] idades = new int[3];
        idades[0] = 15;
        idades[1] = 30;
        idades[2] = 45;

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
