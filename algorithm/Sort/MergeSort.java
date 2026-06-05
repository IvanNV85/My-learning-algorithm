package algorithm.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Mang truoc khi sap xep: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }

    //ham gop 2 mang con da sap xep
    public static void merge(int[] arr, int left, int mid, int right) {
        //tao 2 mang
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        //so sanh phan tu cua 2 mang, chon phan tu nho hon va cho phan tu moi vao arr
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        //copy phan tu con thua neu co vao
        while (i < leftArray.length) arr[k++] = leftArray[i++];
        while(j <rightArray.length) arr[k++] = rightArray[j++];

    }


    //ham de chia va goi de quy
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        //diem mid de chia doi array
        int mid = (left + right) / 2;

        //de quy lai chinh no
        mergeSort(arr, left, mid); //sap xep nua trai
        mergeSort(arr, mid + 1, right); //sap xep nua ben phai

        merge(arr, left, mid, right); //gop 2 nua con lai
    }
}
