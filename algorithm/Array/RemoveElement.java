package algorithm.Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] numberArrays = {3, 2, 2, 3};
        int valueNeedToRemove = 3;
        System.out.println("the first array: " + Arrays.toString(numberArrays));
        System.out.println("value Need To Remove: " + valueNeedToRemove);

        int k = removeElement(numberArrays, valueNeedToRemove);

        System.out.println("------------------------------------");
        System.out.println("Số phần tử còn lại (k): " + k);
        System.out.println("Mảng sau khi xử lý: " + Arrays.toString(numberArrays));
        System.out.print("k phần tử đầu tiên là: [");
        for (int i = 0; i < k; i++) {
            System.out.print(numberArrays[i] + (i == k - 1 ? "" : ", "));
        }
        System.out.println("]");
    }


    public static int removeElement(int[] numbs, int removeValue) {
        int newLength = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != removeValue) {
                numbs[newLength] = numbs[i];
                newLength++;
            }
        }
        return newLength;
    }
}
