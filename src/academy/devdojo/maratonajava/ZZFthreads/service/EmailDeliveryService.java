package academy.devdojo.maratonajava.ZZFthreads.service;

import academy.devdojo.maratonajava.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String ThreadName = Thread.currentThread().getName();
        System.out.println(ThreadName + " starting delivering emails...");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(ThreadName + " sending email for " + email);
                Thread.sleep(2000);
                System.out.println(ThreadName + " sent email succesfully for " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso");
    }
}
