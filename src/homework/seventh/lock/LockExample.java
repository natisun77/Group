package homework.seventh.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) throws Exception {
        Lock lock = new ReentrantLock();

        new FirstThead(lock).start();
        new SecondThread(lock).start();
    }
}
