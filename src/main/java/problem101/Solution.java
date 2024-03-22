package problem101;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 0;
        int n = 1;
        for (int ele : nums) {
            if(ele < 0){
                ans[n] = ele;
                n +=2;
            } else {
                ans[p] = ele;
                p+=2;
            }
        }
        return  ans;
    }
}