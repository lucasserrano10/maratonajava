package academy.devdojo.maratonajava.BJavaCoreMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void impressaoDados(){
        System.out.println("-#-#-#-#-#-#-#");
        System.out.println("NOME -> " + this.nome);
        System.out.println("IDADE -> " + this.idade);
        if(salario != null){
            System.out.println("SALÁRIOS:");
            for (int i = 0; i <  salario.length; i++) {
                System.out.print(this.salario[i] + " <-> ");
            }
            System.out.println();
            System.out.println("-#-#-#-#-#-#-#");
            mediaSalarial();
        }
    }

    public void mediaSalarial(){
        double soma = 0.0;
        for(double valor : salario){
            soma += valor;
        }
        media = soma / salario.length;
        System.out.println("Média salarial -> " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
