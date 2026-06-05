package algorithm.Array;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 2, 5, 3, 6 };
        System.out.println(hasDuplicate(numbers));

    }

    /**
     * Boolean function to check duplicate in an array
     * 
     * 1. sort array
     * 2. use loop to duyet all array
     * 3. use 2 pointer for the current number and the next number
     * 4. if the current number and the next number equal, return true, if not, return false
     * 
     * 
     * @param numbers
     * @return
     */
    public static boolean hasDuplicate(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Arrays after sort: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int next = numbers[i + 1];
            if (numbers[i] == numbers[i + 1]) {
                System.out.println(current);
                System.out.println(next);
                return true;
            }
        }
        return false;
    }
}
