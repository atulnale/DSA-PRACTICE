package problem96;

public class Solution {
    public void sortColors(int[] nums) {
        int ptr0 = 0;
        int ptr2 = nums.length-1;
        for (int i = 0; i <= ptr2; i++) {
            if(nums[i] == 0 && i >= ptr0 ){
                int temp = nums[ptr0];
                nums[ptr0++] = nums[i];
                nums[i] = temp;
                i--;
            } else if(nums[i] == 2 && i <= ptr2) {
                int temp = nums[ptr2];
                nums[ptr2--] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
    }

}