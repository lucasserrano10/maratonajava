package academy.devdojo.maratonajava.FmodificadorStatic.test;

import academy.devdojo.maratonajava.FmodificadorStatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("MERCEDES", 275);
        Carro c3 = new Carro("AUDI", 290);
        c1.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
