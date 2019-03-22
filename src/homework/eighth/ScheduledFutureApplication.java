package homework.eighth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFutureApplication {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Callable<Integer> doTask2 = () -> 77;
        doTask1();
        ScheduledFuture<Integer> schedule = ses.schedule(doTask2, 5, TimeUnit.SECONDS);
        doTask3();
        System.out.println(schedule.get());
        System.out.println("shutdown!");
        ses.shutdown();
    }

    public static void doTask1() {
        System.out.println("Running task1...");
    }

    public static void doTask3() {
        System.out.println("Running task3...");
    }
}
