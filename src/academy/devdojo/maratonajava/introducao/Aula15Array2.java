package academy.devdojo.maratonajava.introducao;

public class Aula15Array2 {
    public static void main(String[] args) {
        // valores padrões
        // int, char, byte, double, float -> 0
        // String -> null
        char [] sexo = new char[3];
        sexo[0] = 'M';
        sexo[1] = 'F';
        sexo[2] = 'M';
        for(int i = 0; i < sexo.length; i++){
            System.out.println("SEXO DO USUÁRIO -> " + i + " - " + sexo[i]);
        }



    }
}
