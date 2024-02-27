package problem42;

public class Approach2 {
    public int trap(int[] height) {
        int ans = 0;

        if(height == null || height.length == 0) return 0;
        int size = height.length;
        int[] leftMax = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int[] rightMax = new int[size];
        rightMax[size-1]= height[size-1];
        for (int i = size-2; i >=0 ; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for (int i = 0; i < size; i++) {
            ans += Math.min(rightMax[i], leftMax[i]) - height[i];
        }
        return ans;
    }
}