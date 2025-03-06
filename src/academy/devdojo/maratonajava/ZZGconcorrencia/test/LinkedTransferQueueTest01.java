package academy.devdojo.maratonajava.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("William"));
        tq.put("Dev");
        tq.transfer("Curso");
        System.out.println(tq.tryTransfer("Tentando", 5, TimeUnit.SECONDS));

    }
}
