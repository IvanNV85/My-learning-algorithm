package algorithm.Array;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 7, 6, 8, 9, 12, 11, 123, 13 };
        int target = 21;
        int[] result = twoSum2(numbers, target);
        System.out.printf("Indices: [%d, %d] -> values: [%d, %d]%n",
                result[0], result[1], numbers[result[0]], numbers[result[1]]);

    }

    // Cach 1: dung hashMap
    public static int[] twoSum1(int[] numbers, int target) {

    HashMap<Integer, Integer> numberMap = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
    int complement = target - numbers[i];
    if (numberMap.containsKey(complement)) {
    return new int[] { numberMap.get(complement), i };
    }
    numberMap.put(numbers[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");

    }

    // cach 2: brute force(duyet tung phan tu)
    public static int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("tim thay gia tri thoa man!");
                    System.out.println("tai vi tri i = " + i + " va j = " + j);
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
