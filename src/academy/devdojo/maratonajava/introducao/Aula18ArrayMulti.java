package academy.devdojo.maratonajava.introducao;

public class Aula18ArrayMulti {
    public static void main(String[] args) {
        // 1 2 3 4 5 meses
        // 31, 28, 31 dias
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

        for(int i = 0; i < dias.length; i++){
            System.out.println("--------------");
            for(int j = 0; j < dias[0].length ; j++) {
                System.out.println(dias[i][j] + " ARRAY -> " + i);
            }
        }

    }
}
