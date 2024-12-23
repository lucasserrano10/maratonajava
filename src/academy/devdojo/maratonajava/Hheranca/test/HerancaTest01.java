package academy.devdojo.maratonajava.Hheranca.test;

import academy.devdojo.maratonajava.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("09080-210");
        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("535670858-08");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Lucas Serrano");
        funcionario.setCpf("53567085808");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(25000.00);
        System.out.println("----------");
        funcionario.imprime();
        System.out.println("---------");
        funcionario.relatorioPagamento();
    }
}
