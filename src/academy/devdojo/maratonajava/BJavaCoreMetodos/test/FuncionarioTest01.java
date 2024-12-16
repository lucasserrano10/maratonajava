package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Lucas";
        funcionario.idade = 23;
        funcionario.salario = new double[] {1200,987,2000};

        funcionario.impressaoDados();

    }
}
