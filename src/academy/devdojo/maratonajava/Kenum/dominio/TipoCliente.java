package academy.devdojo.maratonajava.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }


    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente valor: values()){
            if(valor.getNomeRelatorio().equals(nomeRelatorio)){
                return valor;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
