package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {3,4,5,6,2,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(3,5,2);
    }
}
