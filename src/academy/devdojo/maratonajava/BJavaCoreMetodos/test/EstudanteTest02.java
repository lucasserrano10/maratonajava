package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Lucas";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Babi";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
