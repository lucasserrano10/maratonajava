package academy.devdojo.maratonajava.ZZFthreads.test;

import academy.devdojo.maratonajava.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "SANTANDER");
        Thread t2 = new Thread(threadAccountTest01, "ITAU");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(10);
            if(account.getBalance() < 10){
                System.out.println("Moio zerado !");
            }
        }
    }

    private synchronized void withDrawal(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " Sacando dinheiro...");
            account.withDrawal(amount);
            System.out.println(Thread.currentThread().getName() + " Completou o saque, valor atual da conta " + account.getBalance());
        }else{
            System.out.println("Saldo insuficiente !" + Thread.currentThread().getName() + " Efetuar o saque !");
        }
    }
}
