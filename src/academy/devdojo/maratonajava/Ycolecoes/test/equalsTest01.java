package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

public class equalsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC21", "Iphone");
        Smartphone s2 = new Smartphone("1ABC21", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
