package problem90;

public class Approach1 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
           int index = nums[i] % 1000000;
           if(index < nums.length){
               nums[index] = nums[index] + 1000000;
           }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 1000000) return i;
        }
        return nums.length;
    }
}