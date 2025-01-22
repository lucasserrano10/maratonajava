package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class listTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Lindo");
        nomes2.add("Lucas");
        nomes2.add("Serrano");
        nomes2.add("Lindo");

        nomes.addAll(nomes2);

        nomes.remove(0);
        for(Object nome: nomes){
            System.out.println(nome);
        }
        System.out.println("------");
        // int sixe = nomes.size();
        for(int i = 0; i < nomes.size(); i ++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);
    }
}
