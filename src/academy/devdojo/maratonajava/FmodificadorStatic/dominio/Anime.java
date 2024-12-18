package academy.devdojo.maratonajava.FmodificadorStatic.dominio;

public class Anime {
    // Bloco de inicializacão estatico é carregado antes de ter memória alocada para o objeto criado
    private String nome;
    private static int[] episodios;
    static  {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(){
        for(int episodio:Anime.episodios){
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
