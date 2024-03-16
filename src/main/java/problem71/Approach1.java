package problem71;

public class Approach1 {
    public static int[] reverseArray(int n, int []nums) {
       if(n == 1) return nums;
       int end = n - 1;
        for (int i = 0; i < n/2; i++) {
            int temp = nums[i];
            nums[i] = nums[end - i];
            nums[end - i] = temp;
        }
        return nums;
    }
}