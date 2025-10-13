import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 2, 5, 3, 6 };
        System.out.println(hasDuplicate(numbers));

    }

    /**
     * check duplicate in an array: *
     * 
     * @param numbers
     * @return
     */
    public static boolean hasDuplicate(int[] numbers) {
        Arrays.sort(numbers);
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
