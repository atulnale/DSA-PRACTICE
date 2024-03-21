package problem98;

public class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int currSum = 0;
        for(int ele: nums) {
            currSum = Math.max(ele, currSum + ele);
            ans = Math.max(currSum,ans);
        }
        return ans;
    }
}