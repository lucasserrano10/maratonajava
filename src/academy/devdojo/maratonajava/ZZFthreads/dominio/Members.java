package academy.devdojo.maratonajava.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
//        Bloco de códigoSincronizado, so uma Thread de cada vez vai acessar esse bloco
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmails(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();

        }
    }

    public String retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " checking if there are any emails");
        synchronized (this.emails){
            while (this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName()+ " Não Tem email disponível na lista(fila)");
                try {
                    this.emails.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegamos emails");
        }
    }

}
