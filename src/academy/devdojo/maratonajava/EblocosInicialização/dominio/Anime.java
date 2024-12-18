package academy.devdojo.maratonajava.EblocosInicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("dENTRO DO BLOCO DE INICIALIZAÇÃO");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(){
        for(int episodio:this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
