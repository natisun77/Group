package homework.seventh.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExp {

    public static void main(String[] args) throws Exception {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 4; i++) {
            new Person(semaphore).start();
        }
    }
}
