package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1JJJ1", "Samsung");
        Smartphone s3 = new Smartphone("1JVV1", "Xiaomi");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("2D24D", "Xiaomi");
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s3));

        int indexSmartphone1 = smartphones.indexOf(s1);
        System.out.println(smartphones.get(indexSmartphone1));
    }
}
