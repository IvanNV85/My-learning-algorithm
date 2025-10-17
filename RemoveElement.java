import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] numberArrays = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int valueNeedToRemove = 2;
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

    

    public static int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

}
