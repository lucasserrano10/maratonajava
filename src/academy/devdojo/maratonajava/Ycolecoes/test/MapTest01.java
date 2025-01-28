package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        System.out.println(map);
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("============");

        for(String value : map.values()){
            System.out.println(value);
        }

        // Para ter acesso as duas chaves no mesmo for, podemos udar
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
