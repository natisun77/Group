package homework.seventh.semaphore;

import java.util.concurrent.Semaphore;

public class Person extends Thread {
    private Semaphore semaphore;

    public Person(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " waiting for semaphore.");
            semaphore.acquire();
            System.out.println(getName() + " working with current semaphore.");
            sleep(1000);
            System.out.println(getName() + " has been finished working.");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
