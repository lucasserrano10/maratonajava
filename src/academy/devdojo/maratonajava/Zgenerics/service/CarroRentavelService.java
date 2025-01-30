package academy.devdojo.maratonajava.Zgenerics.service;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
     private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));


    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando Carro disponível...");
        Carro carro = carrosDisponiveis.removeFirst();
        System.out.println("Alugando Carro :" + carro);
        System.out.println("Carros Disponíveis para Alugar :");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo Carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros Disponíveis para Alugar :");
        System.out.println(carrosDisponiveis);
    }

}
