package academy.devdojo.maratonajava.ZZFthreads.test;

import academy.devdojo.maratonajava.ZZFthreads.dominio.Members;
import academy.devdojo.maratonajava.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread lucas = new Thread(new EmailDeliveryService(members), "Lucas");
        Thread quebas = new Thread(new EmailDeliveryService(members), "Quebas");

        lucas.start();
        quebas.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email: ");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmails(email);
        }

    }
}
