package problem121;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int currProd = 1;
        int ans = 0;
        while(j < nums.length){
            if(i > j){
                j++;
                currProd = 1;
                continue;
            }
            if(currProd * nums[j] < k){
                currProd *= nums[j];
                j++;
            } else {
                currProd /= nums[i];
                ans += j - i;
                i++;
            }
        }
        int num = j - i;
        ans += (num * (num+1))/2;
        return ans;
    }
}