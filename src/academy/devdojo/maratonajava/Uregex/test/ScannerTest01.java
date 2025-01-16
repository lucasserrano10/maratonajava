package academy.devdojo.maratonajava.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Nike4 Adidas4 Puma";
        String[] marcas = texto.split("\\d");
        for (String nome : marcas){
            System.out.println(nome.trim());
        }
        // Vamos supor que queremos iterar, porém alguns outros tipos não só String, assim surge o Scanner
    }
}
