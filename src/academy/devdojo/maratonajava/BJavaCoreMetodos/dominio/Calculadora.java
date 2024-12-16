package academy.devdojo.maratonajava.BJavaCoreMetodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int a,int b){
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void divideDoisNumerosSemRetorno(double a, double b){
        if(b == 0){
            System.out.println("Não Existe divisão por zero");
        }
        System.out.println(a/b);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera números");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("SOMA TOTAL -> " + soma);
    }

    public void somaVarArgs( int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("SOMA TOTAL -> " + soma);
    }
}
