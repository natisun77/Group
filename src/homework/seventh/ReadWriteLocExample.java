package homework.seventh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocExample<Integer> {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    private final List<Integer> list = new ArrayList<>();

    public void write(Integer i) {
        writeLock.lock();
        try {
            list.add(i);
            System.out.println("Adding element by thread " + Thread.currentThread().getName());
        } finally {
            writeLock.unlock();
        }
    }

    public Integer read(int i) {
        readLock.lock();
        try {
            System.out.println("Checking elements by thread " + Thread.currentThread().getName());
            return list.get(i);
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLocExample<String> threadSafeArrayList = new ReadWriteLocExample<>();
        threadSafeArrayList.write("1");
        threadSafeArrayList.write("2");
        threadSafeArrayList.write("3");
        System.out.println("Printing the First Element: " + threadSafeArrayList.read(1));
    }
}
