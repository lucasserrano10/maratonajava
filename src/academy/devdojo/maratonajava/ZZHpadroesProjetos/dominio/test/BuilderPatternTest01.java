package academy.devdojo.maratonajava.ZZHpadroesProjetos.dominio.test;

import academy.devdojo.maratonajava.ZZHpadroesProjetos.dominio.Pessoa;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder()
                .firstName("Lucas")
                .lastName("Serrano")
                .username("quebaslebas")
                .email("lucas@hotmail.com")
                .build();

        System.out.println(build);



    }
}
