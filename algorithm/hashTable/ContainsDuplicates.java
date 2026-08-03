package algorithm.hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + containsDuplicate(test1) + " (mong đợi: true)");

        int[] test2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + containsDuplicate(test2) + " (mong đợi: false)");

        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3: " + containsDuplicate(test3) + " (mong đợi: true)");

    }

    //cach 1: dung hashmap, tốn tgian(43ms)
//    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])){
//                map.put(nums[i], 0);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (map.get(nums[i]) > 0) return true;
//        }
//        return false;
//    }

    //cach 2: dùng set, ít thời gian (17ms) và bộ nho hơn
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

}
