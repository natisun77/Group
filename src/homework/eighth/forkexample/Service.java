package homework.eighth.forkexample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Service {
    private static int numberOfThreads = Runtime.getRuntime().availableProcessors();
    private static ForkJoinPool forkJoinPool = new ForkJoinPool(numberOfThreads);
    private static long countOfOperation = 200_000L;

    public static int getNumberOfThreads() {
        return numberOfThreads;
    }

    public static ForkJoinPool getForkJoinPool() {
        return forkJoinPool;
    }

    public static long getCountOfOperation() {
        return countOfOperation;
    }
}
