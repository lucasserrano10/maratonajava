package academy.devdojo.maratonajava.CsobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    // sobrecarga de método

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("<-- " + this.nome + " -->");
        System.out.println("TIPO -> " + this.tipo);
        System.out.println("EPISÓDIOS -> " + this.episodios);
        System.out.println("GÊNERO -> " + this.genero);
        System.out.println("------------");
    }

    public void setGenero(String nome){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

}
