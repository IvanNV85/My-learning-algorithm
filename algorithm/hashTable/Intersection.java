package algorithm.hashTable;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        // Test case 1: Output mong đợi [2,2]
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
        HashMap<Integer, Integer> map = new HashMap<>();

// B1: đếm số lần xuất hiện của từng số trong nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

// B2: duyệt nums2, nếu số đó còn "tồn dư" trong map thì lấy ra
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // giảm số lượng còn lại
            }
        }

// B3: chuyển List sang mảng int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
