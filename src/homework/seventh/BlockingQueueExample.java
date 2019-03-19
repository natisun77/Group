package homework.seventh;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {
    private static BlockingQueue<String> queue = new PriorityBlockingQueue<>();

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(()-> System.out.println(queue.add("element"))).start();
    }

}
