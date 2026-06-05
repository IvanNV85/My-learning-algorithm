package algorithm.String;

public class StringProblem {
    public static void main(String[] args) {
        String[] person1 = { "Nguyen", "Tam", "Hoang" };
        System.out.println(studentId(person1));
    }

    public static String studentId(String[] words) {
        // check neu chuoi rong hoặc chuỗi có độ dài < 3 -> trả về chuỗi rỗng ""
        if (words == null || words.length < 3) {
            return "";
        }

        // gán last = phần tử 0 trong chuỗi, check null và trim
        String last = words[0] == null ? "" : words[0].trim();

        // gán first = phần tử 1 trong chuỗi, check null và trim
        String first = words[1] == null ? "" : words[1].trim();

        // gán mid = phần tử 2 trong chuỗi, check null và trim
        String mid = words[2] == null ? "" : words[2].trim();

        //lấy chữ cái đầu tiên của last và mid name sau đó viết hoa
        char lastInitial = Character.toUpperCase(last.charAt(0));
        char midInitial = Character.toUpperCase(mid.charAt(0));

        //cộng chuỗi 
        String fullName = "" + lastInitial + midInitial + first;

        return fullName;
    }

}
