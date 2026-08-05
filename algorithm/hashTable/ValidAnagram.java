package algorithm.hashTable;

import java.util.HashMap;

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
        HashMap<Character, Integer> map = new HashMap<>();
        //check do dai
        if (s.length() != t.length()) return false;

        //b1: add string s vao map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        //buoc 2: kiem tra string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
            map.put(c, map.get(c) - 1);
        }

        //buoc 3: kiem tra xem có tan suat xuat hien cua cac chu co = 0 hay khong
        for (int value : map.values()) {
            if (value != 0) return false;
        }
        return true;
    }
}
