package academy.devdojo.maratonajava.BJavaCoreMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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
        double media = soma / salario.length;
        System.out.println("Média salarial -> " + media);
    }

}
