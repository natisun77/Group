package homework.forth;

import java.lang.reflect.Array;

public class MyStack<T> {
    private Object[] arr;
    private int counter;

    public MyStack() {
        arr = new Object[10];
    }

    public void push(T t) {
        if (arr.length == counter) {
            Object[] arrIncreased = new Object[arr.length * 3 / 2];
            for (int i = 0; i < arr.length; i++) {
                arrIncreased[i] = arr[i];
            }
            arr = arrIncreased;
        }
        arr[counter] = t;
        counter++;
    }

    public void remove(int number) {
        if (number >= 0 && number <= counter) {
            for (int i = 0; i < number; i++) {
                pop();
            }
        } else {
            System.out.println("Ckeck number " + number);
        }
    }

    public void clear() {
        arr = new Object[10];
        counter = 0;
    }

    public int size() {
        return counter;
    }

    public T peek() {
        if (counter > 0) {
            return (T) arr[counter - 1];
        }
        return null;
    }

    public T pop() {
        if (counter > 0) {
            T element = (T) arr[counter - 1];
            arr[counter - 1] = null;
            counter--;
            return element;
        }
        return null;
    }
}