package homework.seventh.phaser;

import java.util.concurrent.Phaser;

public class Order {
    public static void main(String args[]) {
        Phaser phaser = new Phaser(1);
        int currentPhase;

        System.out.println("Start of theads: ");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        phaser.arriveAndDeregister();

        if(phaser.isTerminated()) {
            System.out.println("Orders were completed.");
        }
    }
}
