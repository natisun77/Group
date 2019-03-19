package homework.seventh.lock;

import java.util.concurrent.locks.Lock;

public class FirstThead extends Thread {
    private Lock lock;

    public FirstThead(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println(getName() + " starts work.");
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " stops work.");
        lock.unlock();
    }
}
