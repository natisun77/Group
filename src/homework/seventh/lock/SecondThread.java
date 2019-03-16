package homework.seventh.lock;

import java.util.concurrent.locks.Lock;

public class SecondThread extends Thread {
    private Lock lock;

    public SecondThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(getName() + " starts...");
        while (true) {
            if (lock.tryLock()) {
                System.out.println(getName() + " is already working.");
                break;
            } else {
                System.out.println(getName() + " waiting.");
            }
        }
    }
}
