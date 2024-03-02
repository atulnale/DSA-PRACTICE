package problem45;

public class Approach2 {
    public int jump(int[] nums) {
        int ans = 0;
        int currEnd = 0;
        int currFar = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currFar = Math.max(currFar, i + nums[i]);
            if(i == currEnd){
                ans++;
                currEnd = currFar;
            }
        }
        return ans;

    }
}