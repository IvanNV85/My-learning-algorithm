package algorithm.Array;

public class FindMaxMin {
    public static void main(String[] args) {

    }

    public static int[] findMaxMin(int[] myList) {
        int max = myList[0];
        int min = myList[0];
        //loop chay tu 1 neu khong muon trung voi min va max
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return new int[]{max, min};
    }
}
