package problem31;

import java.util.*;

public class Approach1 {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1) return;
        int i = nums.length -2;
        while(i >= 0){
            if(nums[i]>=nums[i+1]){
                i--;
            } else {
                break;
            }
        }
        if(i == -1) {
            Arrays.sort(nums);
            return;
        }
        int x = nums[i];
        int xPos = i;
        int min = Integer.MAX_VALUE;
        int minPos = 0;
        while(i < nums.length){
            if(nums[i] > x){
                if(min > nums[i]){
                    min = nums[i];
                    minPos = i;
                }
            }
            i++;
        }
        nums[xPos] = min;
        nums[minPos] = x;
        i = xPos+1;
        List<Integer> list = new ArrayList<>();
        for(; i< nums.length; i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        i = xPos+1;
        for(int t : list){
            nums[i] = t;
            i++;
        }
    }
}