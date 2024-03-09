package problem55;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(max >= nums.length-1) return true;
            if(nums[i] == 0){
                if(max > i){
                    continue;
                }
                return false;
            }
            max = Math.max(i + nums[i], max);

        }
        return true;
    }

}