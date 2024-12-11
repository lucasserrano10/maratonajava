package academy.devdojo.maratonajava.AjavaCoreIntroducao.test;


import academy.devdojo.maratonajava.AjavaCoreIntroducao.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // variavel de referência estudante, recebendo o objeto que foi importado
        System.out.println(estudante.nome);
        estudante.nome = "André";
        System.out.println(estudante.nome);
    }
}
