package academy.devdojo.maratonajava.introducao;

public class Aula20ArrayMulti3 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[1];
        arrayInt[2] = new int[4];


        for(int[] arrayBase: arrayInt){
            System.out.println("------");
            for(int numDentro: arrayBase){
                // Se não darmos o valor para o array dentro do array principal, não temos valor, ele vai ser 0;
                // Porém se inicializarmos da mesma forma que as linhas 7, 8, 9
                System.out.println(numDentro);
            }
        }

    }
}
