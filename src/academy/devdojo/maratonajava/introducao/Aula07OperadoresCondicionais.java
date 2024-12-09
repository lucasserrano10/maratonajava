package academy.devdojo.maratonajava.introducao;

public class Aula07OperadoresCondicionais {
    public static void main(String[] args) {
        // doar se salário for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        // operador ternário
        String resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
//        if(salario >= 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }
//        System.out.println(resultado);


    }
}
