package academy.devdojo.maratonajava.Oexcecao.Exception.dominio;

    public class LoginInvalidoException extends Exception{
        public LoginInvalidoException() {
            super("Login Inválido");
        }

        public LoginInvalidoException(String message) {
            super(message);
        }
    }
