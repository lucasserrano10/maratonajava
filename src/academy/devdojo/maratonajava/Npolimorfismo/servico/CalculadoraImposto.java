package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto : " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto a ser Pago : " + imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de Validade : " + dataValidade);
        }
    }
}
