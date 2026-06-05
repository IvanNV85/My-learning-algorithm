package algorithm.TwoPointers;
public class FindSmallestValueInArray {

    public static void main(String[] args) {
        int[] array = {3423, 100, 102, 23, 123, 1, 133};
        int minVal = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        System.out.println(minVal);

    }
}