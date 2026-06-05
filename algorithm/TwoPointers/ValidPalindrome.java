package algorithm.TwoPointers;
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "skibidi";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        //check the string is not null
        if (s == null)
            return false;

        // pointer left = 0
        int left = 0;

        // pointer right = last character of string length
        int right = s.length() - 1;

        while (left < right) {
            // get character at pointer left
            char charLeft = s.charAt(left);

            // get character at pointer right
            char charRight = s.charAt(right);

            /*
             * if character at pointer left not is a letter or number, skip and jump to the
             * while loop again, left +1
             */
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
                continue;
            }
            /*
             * if character at pointer right not is a letter or number, skip and jump to the
             * while loop again, right -1
             */
            if (!Character.isLetterOrDigit(charRight)) {
                right--;
                continue;
            }

            /* if character lowercase at right and left are not equals, return false */
            if (Character.toLowerCase(charRight) != Character.toLowerCase(charLeft)) {
                return false;
            }
            left++;
            right--;
        }
        //after pass all, return true
        return true;

    }

}
