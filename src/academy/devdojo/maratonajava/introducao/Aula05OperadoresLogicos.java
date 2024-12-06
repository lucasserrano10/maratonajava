package academy.devdojo.maratonajava.introducao;

public class Aula05OperadoresLogicos {
    public static void main(String[] args) {
        // operadores lógicos
        // && (and) || (or) !
        int idade = 22;
        double salario = 3500.0;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        double valorPlayStation = 5000;
        boolean isPlayStationCincoCompravel = contaCorrente > 5000 || contaPoupanca > valorPlayStation;
        System.out.println("É possível comprar o play 5 ? ->" + isPlayStationCincoCompravel);

        // operadores de atribuição =, +=, -=, *=, /=, %=

        int num1 = 5;
        int num2 = 10;
        int num3 = 0;
        num3 += num1;
        num3 += num2;
        System.out.println(num3);

        int contador = 0;
        contador += 1;
        contador++;
        --contador;
        System.out.println(contador);
    }
}
