package homework.seventh.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Application {
    public static void main(String args[]) {
        CyclicBarrier cb = new CyclicBarrier(3, new Action());
        System.out.println("Start");
        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "X");
        new MyThread(cb, "Y");
        new MyThread(cb, "Z");
    }
}


