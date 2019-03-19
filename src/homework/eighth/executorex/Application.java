package homework.eighth.executorex;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Application {
    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new ExampleCallable();
        for (int i = 0; i < 20; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<String> futureList: list) {
            try {
                System.out.println(new Date() + " - " + futureList.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
