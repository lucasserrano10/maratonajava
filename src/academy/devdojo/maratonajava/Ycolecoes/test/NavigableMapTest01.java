package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A","Letra A");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("D","Letra D");
        map.put("E","Letra E");

        for(Map.Entry<String,String> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
