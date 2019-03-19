package homework.eighth.executorex;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ExampleCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return Thread.currentThread().getName();
    }
}
