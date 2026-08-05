package algorithm.Array;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        // Test 1: anagram cơ bản → mong đợi true
        System.out.println("Test 1: " + isAnagram("anagram", "nagaram") + " (mong đợi: true)");

        // Test 2: không phải anagram → mong đợi false
        System.out.println("Test 2: " + isAnagram("rat", "car") + " (mong đợi: false)");

        // Test 3: ký tự lặp lại nhiều lần → mong đợi true
        System.out.println("Test 3: " + isAnagram("aab", "aba") + " (mong đợi: true)");

        // Test 4: t có ký tự mà s không có → mong đợi false (kiểm tra lỗi containsKey)
        System.out.println("Test 4: " + isAnagram("a", "b") + " (mong đợi: false)");

        // Test 5: độ dài khác nhau → mong đợi false (kiểm tra bước check độ dài sớm)
        System.out.println("Test 5: " + isAnagram("ab", "abc") + " (mong đợi: false)");

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }

}
