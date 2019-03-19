package homework.eighth.forkexample;

import java.util.concurrent.ExecutionException;

import static homework.eighth.forkexample.Service.*;

public class Application {
    public static void main(String[] args) throws ExecutionException {
        System.out.println("Count Of Thread = " + getNumberOfThreads());
        System.out.println("Start.");
        System.out.println(getForkJoinPool().invoke(new Model(0,getCountOfOperation())));
        System.out.println("End.");
    }
}
