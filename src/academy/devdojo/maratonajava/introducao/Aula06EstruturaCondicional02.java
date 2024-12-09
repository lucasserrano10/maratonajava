package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaCondicional02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade 15 >= && idade < 18 categoria juvenil
        // idade 18 >= categoria adulto
        int idade = 59;
        String categoria = "Categoria Adulto";;
        if(idade < 15){
            categoria = "Categoria Infantil";
            System.out.println(categoria);
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
            System.out.println(categoria);
        }else{
            System.out.println(categoria);
        }

    }
}
