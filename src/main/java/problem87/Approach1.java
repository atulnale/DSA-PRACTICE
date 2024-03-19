package problem87;

public class Approach1 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) continue;
            int j = i;
            while(j < nums.length){
                if(nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
                j++;

            }

        }
    }
}