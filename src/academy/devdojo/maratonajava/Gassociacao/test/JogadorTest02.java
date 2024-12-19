package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Corinthians");
       jogador2.setTime(time);

       jogador2.imprime();
    }
}
