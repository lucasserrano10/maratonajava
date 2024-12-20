package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador, jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
