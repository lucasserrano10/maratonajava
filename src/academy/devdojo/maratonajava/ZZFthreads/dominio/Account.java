package academy.devdojo.maratonajava.ZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public int withDrawal(int amount){
        this.balance = this.balance - amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
