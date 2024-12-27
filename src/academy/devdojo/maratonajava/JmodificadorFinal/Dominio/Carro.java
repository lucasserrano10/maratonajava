package academy.devdojo.maratonajava.JmodificadorFinal.Dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250.0;
    public final Comprador COMPRADOR = new Comprador();

    // Isso significa que a referencia que COMPRADOR tem, não pode ser mudada

    public final void imprime(){
        System.out.println(this.nome);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
