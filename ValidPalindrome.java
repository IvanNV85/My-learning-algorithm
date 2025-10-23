public class ValidPalindrome {
    public static void main(String[] args) {
        String s ="skibidi";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null)
            return false;

        // pointer left = 0
        int left = 0;
        // pointer right = last character of string length
        int right = s.length() - 1;

        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(charRight)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(charRight) != Character.toLowerCase(charLeft)) {
                return false;
            }

            left++;
            right--;
        }
        return true;

    }

}
