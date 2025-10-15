import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 7, 6, 9, 12, 11, 123, 13 };
        int target = 25 ;
        int[] result = twoSum(numbers, target);
        System.out.printf("Indices: [%d, %d] -> values: [%d, %d]%n",
                result[0], result[1], numbers[result[0]], numbers[result[1]]);

    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numberMap.containsKey(complement))                  {
                return new int[] { numberMap.get(complement), i };
            }
            numberMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

}
