package academy.devdojo.maratonajava.Kenum.teste;

import academy.devdojo.maratonajava.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rodrigo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Lucas", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Vanessa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);

        // Porém quando nao somos apenas nos trabalhando nos dados, com isso é gerado inconsistência
    }
}
