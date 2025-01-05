package academy.devdojo.maratonajava.Npolimorfismo.Test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook Air M1", 6500.0);
        Tomate tomate = new Tomate("Italiano", 10.0);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
