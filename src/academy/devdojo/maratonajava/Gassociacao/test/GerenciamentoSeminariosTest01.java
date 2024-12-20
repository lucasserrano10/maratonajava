package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.Gassociacao.dominio.Endereco;
import academy.devdojo.maratonajava.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.Gassociacao.dominio.Seminario;

public class GerenciamentoSeminariosTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av paulista, 1003");
        Aluno aluno = new Aluno("Arthur", 18);
        Aluno aluno1 = new Aluno("Lucas", 20);
        Professor professor = new Professor("Aleksey", "Química");
        Aluno[] alunosSeminario = {aluno, aluno1};
        Seminario seminario = new Seminario("Adiante da Química Orgânica", alunosSeminario, endereco);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.relatorioSeminario();
    }
}
