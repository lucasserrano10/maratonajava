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
}
