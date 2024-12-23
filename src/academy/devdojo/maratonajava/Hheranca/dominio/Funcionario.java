package academy.devdojo.maratonajava.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco Estático funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático - funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático - funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionário");
    }

    public void imprime(){
        super.imprime();
        if(salario != 0){
            System.out.println(this.salario);
        }
    }

    public void relatorioPagamento(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
