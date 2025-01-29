package academy.devdojo.maratonajava.Zgenerics.test;


import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

    }
    private static void printConsulta(List<? extends Animal> animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Cachorro> animals){
        for(Object o : animals){
        }
    }

}
