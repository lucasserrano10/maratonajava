package academy.devdojo.maratonajava.introducao;

public class Aula19Arraymulti2 {
    public static void main(String[] args) {
        // vamos usar o ForEach
        int[][] dias = new int[3][3];
        dias[0][0] = 25;
        dias[0][1] = 25;
        dias[0][2] = 25;

        dias[1][0] = 30;
        dias[1][1] = 30;
        dias[1][2] = 30;

        dias[2][0] = 45;
        dias[2][1] = 45;
        dias[2][2] = 45;

        for(int[] array: dias){
            for(int num: array){
                System.out.println(num);
            }
        }
    }
}
