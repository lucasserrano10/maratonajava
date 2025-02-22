package academy.devdojo.maratonajava.Zgenerics.service;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponível...");
        Barco Barco = barcosDisponiveis.removeFirst();
        System.out.println("Alugando Barco :" + Barco);
        System.out.println("Barcos Disponíveis para Alugar :");
        System.out.println(barcosDisponiveis);
        return Barco;
    }

    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco " + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos Disponíveis para Alugar :");
        System.out.println(barcosDisponiveis);
    }

}
