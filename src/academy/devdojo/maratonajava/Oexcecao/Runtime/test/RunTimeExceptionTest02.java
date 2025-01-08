package academy.devdojo.maratonajava.Oexcecao.Runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        requisicaoDeDadosExemplo();
    }

    private static void requisicaoDeDadosExemplo(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando Arquivo");
        }
    }
}
