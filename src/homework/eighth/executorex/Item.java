package homework.eighth.executorex;

import java.util.concurrent.Callable;

public class Item implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return Thread.currentThread().getName();
    }
}
