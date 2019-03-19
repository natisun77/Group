package homework.seventh.phaser;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {
    Phaser phaser;
    String name;

    MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " begins first phase.");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thead " + name + " begins second phase.");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " begins third phase.");

        phaser.arriveAndDeregister();
    }
}

