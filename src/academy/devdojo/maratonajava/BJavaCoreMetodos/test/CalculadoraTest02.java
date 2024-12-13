package academy.devdojo.maratonajava.BJavaCoreMetodos.test;

import academy.devdojo.maratonajava.BJavaCoreMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;

        Calculadora calculadora = new Calculadora();
        // quando passamos valores do tipo primitivo para o método estamos passando uma cópia e não o valor em si
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
