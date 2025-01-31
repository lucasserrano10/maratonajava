package academy.devdojo.maratonajava.Zgenerics.test;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> listaBarcos = criarArrayComUmObjeto(new Barco("Lancha 12 pés"));
        System.out.println(listaBarcos);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

}
