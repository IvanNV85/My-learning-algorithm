package algorithm.hashTable;

import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        // Ví dụ 1: mong đợi true
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + containsNearbyDuplicate(nums1, 3) + " (mong đợi: true)");

        // Ví dụ 2: mong đợi true
        int[] nums2 = {1, 0, 1, 1};
        System.out.println("Test 2: " + containsNearbyDuplicate(nums2, 1) + " (mong đợi: true)");

        // Ví dụ 3: mong đợi false
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println("Test 3: " + containsNearbyDuplicate(nums3, 2) + " (mong đợi: false)");

        // Test edge case: k = 0, không có cặp nào thỏa mãn (i khác j nhưng abs(i-j)<=0 là vô lý)
        int[] nums4 = {1, 1};
        System.out.println("Test 4: " + containsNearbyDuplicate(nums4, 0) + " (mong đợi: false)");

        // Test: giá trị trùng lặp nhưng cách xa hơn k, sau đó có cặp gần trong k
        int[] nums5 = {1, 5, 9, 1, 1};
        System.out.println("Test 5: " + containsNearbyDuplicate(nums5, 1) + " (mong đợi: true)");

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int oldIndex = map.get(nums[i]);
                if (Math.abs(i - oldIndex) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

