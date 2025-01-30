package academy.devdojo.maratonajava.Zgenerics.service;

import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponível...");
        T t = objetosDisponiveis.removeFirst();
        System.out.println("Alugando objeto :" + t);
        System.out.println("Objetos Disponíveis para Alugar :");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo Objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponíveis para Alugar :");
        System.out.println(objetosDisponiveis);
    }
}
