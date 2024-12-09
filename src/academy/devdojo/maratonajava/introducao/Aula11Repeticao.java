package academy.devdojo.maratonajava.introducao;

public class Aula11Repeticao {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("While");
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count++;
        }
        System.out.println("Do / While");
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i <= 5);

        System.out.println("For");
        for(int index = 0; index <= 5; index++){
            System.out.println(index);
        }
    }
}
