package academy.devdojo.maratonajava.introducao;

public class Aula08EstruturaCondicionalExercicio {
    public static void main(String[] args) {
        // taxas de acordo com salário holanda 2020 - exercício
        // between 0 - 34.712 -> 9.7%
        // between 34.713 - 68.507 -> 37.35%
        // higher than 68.508 -> 49.50%
        double salario = 54311;
        double salarioPosDesconto;
        String taxa;
        double valorImposto;
        if(salario >= 34713 && salario <= 68507){
            taxa = "37.35%";
            salarioPosDesconto = salario * (37.35/100);
            valorImposto = salario - salarioPosDesconto;
        }else if(salario >= 68508){
            taxa = "49.50%";
            salarioPosDesconto = salario * (49.50/100);
            valorImposto = salario - salarioPosDesconto;
        }else{
            taxa = "9.7%";
            salarioPosDesconto = salario * (9.7/100);
            valorImposto = salario - salarioPosDesconto;
        }
        System.out.println("O seu imposto de acordo com o salário de " + salario + "€ é de " + taxa);
        System.out.println("Salário pós desconto " + salarioPosDesconto);
        System.out.println("Você vai ter que pagar " + valorImposto + " de imposto !");
    }
}
