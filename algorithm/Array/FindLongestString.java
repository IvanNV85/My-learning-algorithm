package algorithm.Array;

public class FindLongestString {
    public static void main(String[] args) {

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
