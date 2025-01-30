package academy.devdojo.maratonajava.Zgenerics.test;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        rentalServiceBarco.retornarObjetoAlugado(barco);

        System.out.println("---------------");

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        rentalServiceCarro.retornarObjetoAlugado(carro);


    }
}
