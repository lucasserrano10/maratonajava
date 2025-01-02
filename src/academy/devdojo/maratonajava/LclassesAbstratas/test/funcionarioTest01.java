package academy.devdojo.maratonajava.LclassesAbstratas.test;

import academy.devdojo.maratonajava.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.LclassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.LclassesAbstratas.dominio.Gerente;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rodrigo", 70000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Márcio", 15000.0);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
    }
}
