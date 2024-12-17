package academy.devdojo.maratonajava.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome,tipo,episodios,genero);
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("<-- " + this.nome + " -->");
        System.out.println("TIPO -> " + this.tipo);
        System.out.println("EPISÓDIOS -> " + this.episodios);
        System.out.println("GÊNERO -> " + this.genero);
        System.out.println("ESTÚDIO -> " + this.estudio);
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
