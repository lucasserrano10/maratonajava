package academy.devdojo.maratonajava.AjavaCoreIntroducao.test;

import academy.devdojo.maratonajava.AjavaCoreIntroducao.dominio.Carro;

public class Concessonaria01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro2.nome = "A45 AMG";
        carro2.modelo = "MERCEDES-BENZ";
        carro2.ano = 2023;

        carro1.nome = "330i";
        carro1.modelo = "BMW";
        carro1.ano = 2025;

        System.out.println("\nModelos em Estoque !");
        System.out.println("\nNOME -> " + carro1.nome);
        System.out.println("MODELO -> " + carro1.modelo);
        System.out.println("ANO -> " + carro1.ano);
        System.out.println("\nNOME -> " + carro2.nome);
        System.out.println("MODELO -> " + carro2.modelo);
        System.out.println("ANO -> " + carro2.ano);
    }
}
