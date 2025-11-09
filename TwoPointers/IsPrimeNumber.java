package TwoPointers;
public class IsPrimeNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        listPrime(a, b);
    }

    // prime(số nguyên tố): là số nguyên dương chỉ có 2 ước là 1 và chính nó
    public static boolean isPrime(int number) {
        // 0 và 1 không phải prime number
        if (number < 2) {
            return false;
        }

        // int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }
}
