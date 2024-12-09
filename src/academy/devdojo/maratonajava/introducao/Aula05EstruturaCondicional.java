package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional {
    public static void main(String[] args) {
        int idade = 1;
        boolean checarIdade = idade >= 18;
        if(checarIdade){
            System.out.println("Maior de Idade");
        }
        if(!checarIdade){
            System.out.println("Menor de idade !");
        }
    }
}
