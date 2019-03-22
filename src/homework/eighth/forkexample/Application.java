package homework.eighth.forkexample;

import java.util.concurrent.ExecutionException;

import static homework.eighth.forkexample.Service.*;

public class Application {
    public static void main(String[] args) throws ExecutionException {
        System.out.println("Count Of Thread = " + NUMBER_OF_THREADS);
        System.out.println("Start.");
        System.out.println(FORK_JOIN_POOL.invoke(new Item(0, COUNT_OF_OPERATION)));
        System.out.println("End.");
    }
}
