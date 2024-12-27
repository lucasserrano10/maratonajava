package academy.devdojo.maratonajava.JmodificadorFinal.Test;

import academy.devdojo.maratonajava.JmodificadorFinal.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Lucas");
        System.out.println(carro.COMPRADOR);
    }
}
