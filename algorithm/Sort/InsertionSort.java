package algorithm.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        System.out.println("Mang truoc khi sap xep: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
