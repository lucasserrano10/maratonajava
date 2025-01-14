package academy.devdojo.maratonajava.TresourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
//        boolean chaveAleatoriaTest = bundle.containsKey("ola");
//        System.out.println(chaveAleatoriaTest);
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("hi"));
    }
}
