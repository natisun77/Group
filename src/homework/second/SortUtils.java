package homework.second;
//2.3
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortUtils {
    public static int[] bubbleSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        for (int j = 0; j < copyArr.length; j++) {
            for (int i = 1; i < copyArr.length - j; i++) {
                if (copyArr[i] < copyArr[i - 1]) {
                    exchangeArrElements(copyArr, i, (i - 1));
                }
            }
        }

        return copyArr;
    }

    public static int[] exchangeArrElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static int[] selectSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copyArr.length; i++) {
            int min = copyArr[i];
            int minIndex = i;
            for (int j = i + 1; j < copyArr.length; j++) {
                if (copyArr[j] < min) {
                    min = copyArr[j];
                    minIndex = j;
                    if (i != minIndex) {
                        exchangeArrElements(copyArr, i, minIndex);
                    }
                }
            }
        }
        return copyArr;
    }


    public static int[] quickSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int startIndex = 0;
        int endIndex = copyArr.length - 1;
        quickSort(copyArr, startIndex, endIndex);
        return copyArr;
    }

    private static void quickSort(int[] arr, int start, int end) {
        int i = start, j = end;
        int middle = arr[start + (end - start) / 2];

        while (i < j) {
            while (arr[i] < middle) {
                i++;
            }
            while (arr[j] > middle) {
                j--;
            }
            if (i <= j) {
                exchangeArrElements(arr, i, j);
                i++;
                j--;
            }
        }

        if (start < j) {
            quickSort(arr, start, j);
        }
        if (i < end) {
            quickSort(arr, i, end);
        }
    }

    private static Random random = new Random();

    private static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    public static void main(String[] arg) {
        int[] arr = generateRandomIntArray(1000);
        System.out.println(Arrays.toString(arr));
        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        System.out.println("Bubble sort took " + (System.currentTimeMillis() - startTime) + " ms to execute");

        startTime = System.currentTimeMillis();
        quickSort(arr);
        System.out.println("Quick sort took " + (System.currentTimeMillis() - startTime) + " ms to execute");

        startTime = System.currentTimeMillis();
        selectSort(arr);
        System.out.println("Selection sort took " + (System.currentTimeMillis() - startTime) + " ms to execute");
    }
}
