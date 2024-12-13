package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Lucas";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Babi";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
