package homework.eighth.forkexample;

import java.util.concurrent.RecursiveTask;

public class Model extends RecursiveTask<Long> {
    private long from;
    private long to;

    public Model(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) <= Service.getCountOfOperation()  / Service.getNumberOfThreads()) {
            long result = 0;
            for (long i = from; i < to; i++) {
                result += i;
            }
            return result;
        } else {
            long middle = (to + from) / 2;
            Model firstHalf = new Model(from, middle);
            firstHalf.fork();
            Model seconHalf = new Model(middle + 1, to);
            long seconValue = seconHalf.compute();
            return firstHalf.join()+seconValue;
        }
    }
}
