package homework.seventh;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


public class AtomicIntegerExample {

    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 1000)
                .forEach(i -> {
                    Runnable task = () -> atomicInt.updateAndGet(n -> n + 2);
                    executor.execute(task);
                });

        executor.shutdown();

        try {
            boolean result = executor.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Result of termination " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(atomicInt.get());
    }
}
