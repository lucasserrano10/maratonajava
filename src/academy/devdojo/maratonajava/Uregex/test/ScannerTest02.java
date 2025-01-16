package academy.devdojo.maratonajava.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        // Vamos supor que queremos iterar, porém alguns outros tipos não só String, assim surge o Scanner
        String texto = "Nike,Adidas,Puma,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int -> " +  i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean -> " + b);
            }else {
                System.out.println("Não é Boolean nem Int -> " + scanner.next());
            }
        }

    }
}
