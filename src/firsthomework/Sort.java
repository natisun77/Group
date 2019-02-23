package firsthomework;
//1.5

import java.util.Arrays;

public class Sort {

    public Sort() {
    }

    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                    if (i != minIndex) {
                        int temt = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temt;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        quickSort(arr, startIndex, endIndex);
        System.out.println(Arrays.toString(arr));
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
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

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

    public static void main(String[] arg) {

        int arr[] = {3, 2, 1, 5, 10, 20};
        bubbleSort(arr);
        quickSort(arr);
        selectSort(arr);


    }

}
