package homework.eighth.scheduledexecutorex;

import java.util.concurrent.Callable;

public class Item implements Callable<String> {
    private static final String MESSAGE = "End.";

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
        return MESSAGE;
    }
}
