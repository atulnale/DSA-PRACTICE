package problem80;

public class Approach1 {
    static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
}