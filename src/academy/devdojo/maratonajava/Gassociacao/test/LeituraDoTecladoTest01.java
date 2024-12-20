package academy.devdojo.maratonajava.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
//        String next = inputUsuario.next();
//        String next2 = inputUsuario.nextLine();
//        System.out.println(next);
//        System.out.println(next2);
        System.out.println("Digite seu nome abaixo");
        String nome = inputUsuario.nextLine();
        System.out.println("Certo, seu nome então é " + nome);
        System.out.println("Digite sua idade abaixo");
        int idade = inputUsuario.nextInt();
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Digite seu sexo (M/F)");
        char sexo = inputUsuario.next().charAt(0);
        System.out.println("E seu sexo é " + sexo);

    }
}
