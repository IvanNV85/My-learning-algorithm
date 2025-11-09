package String;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] string = { "flower", "flight", "flow" };
        System.out.println(longestCommonPrefix(string));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return " ";
        }
        String firstString = strs[0];
        for (int i = 0; i < firstString.length(); i++) {
            char charToCompare = firstString.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                String currentString = strs[j];
                if (i == currentString.length() || currentString.charAt(i) != charToCompare) {
                    return firstString.substring(0, i);
                }

            }
        }
        return firstString;
    }

}
