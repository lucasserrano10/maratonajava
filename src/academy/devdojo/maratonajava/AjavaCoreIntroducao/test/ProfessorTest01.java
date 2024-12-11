package academy.devdojo.maratonajava.AjavaCoreIntroducao.test;

import academy.devdojo.maratonajava.AjavaCoreIntroducao.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Aleksey";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Dados do professor !");
        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }
}
