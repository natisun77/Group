package homework.eighth.scheduledexecutorex;

import java.util.concurrent.Callable;

public class Item implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
        return "End.";
    }
}
