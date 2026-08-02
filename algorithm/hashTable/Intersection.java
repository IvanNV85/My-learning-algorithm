package algorithm.hashTable;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {

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
