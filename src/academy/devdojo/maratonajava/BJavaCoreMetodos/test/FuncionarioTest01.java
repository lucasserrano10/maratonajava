package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Lucas");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[] {1250, 3450, 5000});

        funcionario.impressaoDados();


    }
}
