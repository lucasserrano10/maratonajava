package academy.devdojo.maratonajava.AjavaCoreIntroducao.test;

import academy.devdojo.maratonajava.AjavaCoreIntroducao.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Lucas Serrano";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
