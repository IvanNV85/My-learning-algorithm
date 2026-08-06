package algorithm.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        // Ví dụ 1: mong đợi [5, 6]
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Test 1: " + findDisappearedNumbers(nums1) + " (mong đợi: [5, 6])");

        // Ví dụ 2: mong đợi [2]
        int[] nums2 = {1, 1};
        System.out.println("Test 2: " + findDisappearedNumbers(nums2) + " (mong đợi: [2])");

        // Test: không thiếu số nào
        int[] nums3 = {1, 2, 3};
        System.out.println("Test 3: " + findDisappearedNumbers(nums3) + " (mong đợi: [])");

        // Test: mảng chỉ có 1 phần tử
        int[] nums4 = {1};
        System.out.println("Test 4: " + findDisappearedNumbers(nums4) + " (mong đợi: [])");


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //b1: them tat ca phan tu vao set
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
