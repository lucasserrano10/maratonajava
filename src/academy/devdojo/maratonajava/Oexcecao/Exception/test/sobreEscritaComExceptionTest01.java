package academy.devdojo.maratonajava.Oexcecao.Exception.test;

import academy.devdojo.maratonajava.Oexcecao.Exception.dominio.Funcionario;
import academy.devdojo.maratonajava.Oexcecao.Exception.dominio.Pessoa;

public class sobreEscritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        funcionario.salvar();
    }
}
