package problem114;

public class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if(nums[temp-1] < 0){
                return temp;
            }
            nums[temp - 1] = -nums[temp - 1];
        }
        return -1;
    }
}