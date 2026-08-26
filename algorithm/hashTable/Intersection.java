package algorithm.hashTable;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        // Test case 1: Output mong đợi [2]
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        System.out.println("Test 1: " + Arrays.toString(intersect(nums1_1, nums2_1)));

        // Test case 2: Output mong đợi [9,4] hoặc [4,9]
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println("Test 2: " + Arrays.toString(intersect(nums1_2, nums2_2)));

        // Test case 3: không có phần tử chung, output mong đợi []
        int[] nums1_3 = {1, 2, 3};
        int[] nums2_3 = {4, 5, 6};
        System.out.println("Test 3: " + Arrays.toString(intersect(nums1_3, nums2_3)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //b1: luu cac value cua nums1 vao set
        for (int j : nums1) {
            set1.add(j);
        }

        //neu co phan tu trung voi set 1 thi add vao set 2
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }

        //chuyen thanh mang tra ve co size = set2
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
