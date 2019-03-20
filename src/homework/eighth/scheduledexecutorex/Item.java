package homework.eighth.scheduledexecutorex;

import java.util.concurrent.Callable;

public class Item implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
        return "End.";
    }
}
