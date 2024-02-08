package problem11;


import java.util.HashMap;

public class Approach1 {
    public int maxArea(int[] height) {
        int result=0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            result = Math.max(result, (j-i) * Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
