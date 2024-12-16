package academy.devdojo.maratonajava.BJavaCoreMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getName(){
        return this.nome;
    }

    public int getAge(){
        return this.idade;
    }
}
