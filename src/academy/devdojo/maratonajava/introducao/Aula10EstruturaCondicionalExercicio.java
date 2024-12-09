package academy.devdojo.maratonajava.introducao;

public class Aula10EstruturaCondicionalExercicio {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou dia da semana
        // Considerando 1 como Domingo
        byte diaSemana = 4;
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("Dia não útil, fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Não reconhecemos o dia, digite um número de 1 a 7");

        }
    }
}
