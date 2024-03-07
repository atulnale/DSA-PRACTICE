package problem53;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Approach1 {
    public int maxSubArray(int[] nums) {
            int ans = Integer.MIN_VALUE;
            int curr = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                curr = Math.max(curr, 0) + nums[j];
                ans = Math.max(curr, ans);
            }
        return ans;
    }

}