package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Neymar");
        pessoa.setIdade(42);
        pessoa.imprime();

        String nome = pessoa.getName();
        int idade = pessoa.getAge();

        System.out.println(nome);
        System.out.println(idade);
    }
}
