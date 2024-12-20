package academy.devdojo.maratonajava.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu digitarei sim ou não");
        while (true){
            String pergunta = input.nextLine();
            if(pergunta == "0"){
                break;
            }
            if(pergunta.charAt(0) == ' '){
                System.out.println("SIM");
            }else{
                System.out.println("NÃO");
            }
        }
    }
}
