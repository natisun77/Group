package homework.eighth.executorex;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {
    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new Item();
        for (int i = 0; i < 20; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<String> futureList: list) {
            try {
                System.out.println(LocalTime.now() + " - " + futureList.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
