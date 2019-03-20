package homework.eighth.forkexample;

import java.util.concurrent.RecursiveTask;

public class Item extends RecursiveTask<Long> {
    private long from;
    private long to;

    public Item(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) <= Service.COUNT_OF_OPERATION / Service.NUMBER_OF_THREADS) {
            long result = 0;
            for (long i = from; i < to; i++) {
                result += i;
            }
            return result;
        } else {
            long middle = (to + from) / 2;
            Item firstHalf = new Item(from, middle);
            firstHalf.fork();
            Item seconHalf = new Item(middle + 1, to);
            long seconValue = seconHalf.compute();
            return firstHalf.join()+seconValue;
        }
    }
}
