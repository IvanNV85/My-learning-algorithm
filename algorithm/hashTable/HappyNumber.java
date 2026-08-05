package algorithm.hashTable;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Test 1: n=19  -> " + isHappy(19) + " (mong đợi: true)");
        System.out.println("Test 2: n=2   -> " + isHappy(2) + " (mong đợi: false)");
        System.out.println("Test 3: n=1   -> " + isHappy(1) + " (mong đợi: true)");
        System.out.println("Test 4: n=7   -> " + isHappy(7) + " (mong đợi: true)");
        System.out.println("Test 5: n=4   -> " + isHappy(4) + " (mong đợi: false)");
        System.out.println("Test 6: n=100 -> " + isHappy(100) + " (mong đợi: true)");
    }

    /**
     * Kiểm tra xem một số nguyên dương n có phải là "happy number" hay không.
     * Một số được coi là happy number nếu, khi liên tục thay thế nó bằng tổng
     * bình phương các chữ số của nó, quá trình cuối cùng dừng lại ở giá trị 1.
     * Nếu quá trình rơi vào một chu trình lặp vô hạn không chứa số 1,
     * số đó không phải là happy number.
     *
     * @param n số nguyên dương cần kiểm tra
     * @return {@code true} nếu n là happy number, {@code false} nếu ngược lại
     */
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) return false;
            set.add(n);
            n = sumOfSquaredDigits(n);
        }
        return true;
    }

    public static int sumOfSquaredDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit * lastDigit;
            n = n / 10;
        }
        return sum;
    }
}
