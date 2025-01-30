package academy.devdojo.maratonajava.Zgenerics.test;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
