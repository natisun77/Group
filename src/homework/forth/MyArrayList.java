package homework.forth;

public class MyArrayList<T> implements List<T> {
    private Object[] arr;
    private int counter;

    public MyArrayList() {
        arr = new Object[10];
    }

    public T get(int index) {
        if (index < 0 || index >= counter) {
            System.out.println("Error. Please check the index " + index);
            return null;
        } else {
            return (T) arr[index];
        }
    }

    public void add(T t) {
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

    public void remove(int index) {
        if (index < 0 || index >= counter) {
            System.out.println("Error. Please check the index " + index);
        } else {
            for (int j = index; j < counter; j++) {
                arr[j] = arr[j + 1];
            }
            arr[counter] = null;
            counter--;
        }
    }

    public int size() {
        return counter;
    }

    public void clear() {
        for (int i = 0; i < counter; i++) {
            arr[i] = null;
        }
    }
}
