package problem102;

public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1 || nums.length == 0) return;
        int i = nums.length-2;
        while(i >= 0 ){
            if(nums[i]< nums[i+1]){
                break;
            }
            i--;
        }
        if(i == -1) {
            reverse(nums, 0);
        } else{
            int temp = Integer.MAX_VALUE;
            int iter = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] > nums[i] && nums[j] < temp){
                    iter = j;
                }
            }
            temp = nums[iter];
            nums[iter] = nums[i];
            nums[i] = temp;
            reverse(nums, i + 1);
        }

    }

    private void reverse(int[] nums, int i) {
        int n = nums.length-1;
        int mid = i + (n-i)/2;
        for (int j = i; j <= mid; j++) {
            swap(nums, j, n );
            n--;
        }
    }

    private void swap(int[] nums, int j, int n) {
        int temp = nums[j];
        nums[j] = nums[n];
        nums[n] = temp;
    }


}