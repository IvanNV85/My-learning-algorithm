package algorithm.Array;

import java.util.Arrays;

public class FindLongestString {
    public static void main(String[] args) {
        String[] example = {"apple", "banana", "kiwi", "pear"};
        System.out.println("We have an array: " + Arrays.toString(example));
        System.out.println("The longest string is: "+ findLongestString(example));
    }

    public static String findLongestString(String[] stringList) {
        if (stringList.length == 0) return "";
        String longestString = stringList[0];
        for (int i = 1; i < stringList.length; i++) {
            if (stringList[i].length() > longestString.length()) {
                longestString = stringList[i];
            }
        }
        return longestString;
    }
}
