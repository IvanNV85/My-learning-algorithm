package algorithm.hashTable;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        // Test case 1: Output mong đợi [2]
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        System.out.println("Test 1: " + Arrays.toString(intersection(nums1_1, nums2_1)));

        // Test case 2: Output mong đợi [9,4] hoặc [4,9]
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println("Test 2: " + Arrays.toString(intersection(nums1_2, nums2_2)));

        // Test case 3: không có phần tử chung, output mong đợi []
        int[] nums1_3 = {1, 2, 3};
        int[] nums2_3 = {4, 5, 6};
        System.out.println("Test 3: " + Arrays.toString(intersection(nums1_3, nums2_3)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int i = 0; i < nums2.length; i++) {
            int containsNumber = nums2[i];
            if (set.contains(containsNumber)) {
                resultSet.add(containsNumber);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index] = num;
            index++;
        }
        return result;
    }
}
