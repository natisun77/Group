package firsthomework;
//1.5

import java.util.Arrays;

public class Sort {

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
    }


    public static void quickSort(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        quickSort(arr, startIndex, endIndex);
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

        int arr[] = {35, 62, 111, 57, 10, 20, 75,92,};
        bubbleSort(arr);
        System.out.println(Arrays.toString((arr)));
        int arr1[] = {35, 62, 111, 57, 10, 20, 75,92,};
        quickSort(arr1);
        System.out.println(Arrays.toString((arr1)));
        int arr2[] = {35, 62, 111, 57, 10, 20, 75,92,};
        selectSort(arr2);
        System.out.println(Arrays.toString((arr2)));
    }
}
