package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class listTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Serrano");
        nomes.add("Lindo");
        for(Object nome: nomes){
            System.out.println(nome);
        }
        System.out.println("------");
        for(int i = 0; i < nomes.size(); i ++){
            System.out.println(nomes.get(i));
        }
    }
}
