package academy.devdojo.maratonajava.introducao;

public class Aula16Array3 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Batman";
        nomes[1] = "Joker";
        nomes[2] = "Flash";
        nomes = new String[5];
        // A partir do momento que fazemos isso, o antigo nome será deletado da memória com seus valores, que é chamado de garbed collector
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
