package academy.devdojo.maratonajava.ZZFthreads.test;

class  ThreadExampleRunnable implements Runnable{
    private char c;
    public ThreadExampleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadExample extends Thread{
    private char c;
    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

// Daemon X User

public class ThreadTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "Thread1");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "Thread2");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "Thread3");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "Thread4");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
