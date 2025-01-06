package academy.devdojo.maratonajava.Npolimorfismo.Test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Macbook Pro", 11500.0);

        Tomate tomate = new Tomate("Italiano", 20.0);
        tomate.setDataValidade("21/12/2024");

        CalculadoraImposto.calcularImposto(produto);


    }
}
