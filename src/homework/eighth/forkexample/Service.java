package homework.eighth.forkexample;

import java.util.concurrent.ForkJoinPool;

public class Service {
    public static final int NUMBER_OF_THREADS = Runtime.getRuntime().availableProcessors();
    public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool(NUMBER_OF_THREADS);
    public static final long COUNT_OF_OPERATION = 200_000L;
}
