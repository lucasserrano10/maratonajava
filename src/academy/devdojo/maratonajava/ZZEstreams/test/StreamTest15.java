package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest15 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStream(num);
        sumParallelStream(num);
        sumParallelLongStream(num);
    }
     private static void sumFor(long num){
         System.out.println("Sum For");
         long result = 0;
         long init = System.currentTimeMillis();
         for(long i = 1; i <= num; i++){
             result += 1;
         }
         long end = System.currentTimeMillis();
         System.out.println(result + " Result " + (end - init) + " ms");
     }

    private static void sumStream(long num){
        System.out.println("Sum For");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " Result " + (end - init) + " ms");
    }

    private static void sumParallelStream(long num){
        System.out.println("Sum For");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " Result " + (end - init) + " ms");
    }

    private static void sumLongParallelStream(long num){
        System.out.println("Sum For");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " Result " + (end - init) + " ms");
    }

    private static void sumParallelLongStream(long num){
        System.out.println("Sum Parallel Stream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " Result " + (end - init) + " ms");
    }

}
