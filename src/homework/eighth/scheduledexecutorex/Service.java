package homework.eighth.scheduledexecutorex;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Service {
    public static ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

    public static void main(String[] args){
        service.schedule(new Item(),3,TimeUnit.SECONDS);
        service.schedule(new Item(),2,TimeUnit.SECONDS);
        service.schedule(new Item(),3,TimeUnit.SECONDS);
        service.schedule(new Item(),2,TimeUnit.SECONDS);
        service.schedule(new Item(),2,TimeUnit.SECONDS);
        service.shutdown();
    }
}
