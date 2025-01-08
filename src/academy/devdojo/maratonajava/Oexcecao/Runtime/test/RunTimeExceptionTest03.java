package academy.devdojo.maratonajava.Oexcecao.Runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (IndexOutOfBoundsException e){
            System.out.println(e + " Index error");
        }catch (IllegalAccessError e){
            System.out.println(e + " Acesso Ilegal");
        }catch (ArithmeticException e){
            System.out.println(e + " Aritmetica Exception");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RunTimeException");
        }


        try{
            talvezLanceExcecao();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException {

    }
}
