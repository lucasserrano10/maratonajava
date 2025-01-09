package academy.devdojo.maratonajava.Oexcecao.Exception.test;

import academy.devdojo.maratonajava.Oexcecao.Exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner input = new Scanner(System.in);
        String usernameDB = "queba";
        String senhaDB = "timao";
        System.out.print("Usuário : ");
        String userNameResposta = input.nextLine();
        System.out.print("Senha : ");;
        String userSenhaResposta = input.nextLine();
        if(!usernameDB.equals(userNameResposta) || !senhaDB.equals(userSenhaResposta)){
            throw new LoginInvalidoException("Usuário ou Senha Inválidos");
        }
        System.out.println("Usuário Logado Com Sucesso !");
    }

}
