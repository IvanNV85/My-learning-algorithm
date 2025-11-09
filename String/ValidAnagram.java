package String;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "jar";
        String t = "jam";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        // buoc 1: kiem tra do dai 2 chuoi
        if (s.length() != t.length()) {
            return false;
        }

        // chuyen ve chuoi cac ki tu va sap xep
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        // so sanh 2 chuoi
        return Arrays.equals(sSort, tSort);

    }
}
