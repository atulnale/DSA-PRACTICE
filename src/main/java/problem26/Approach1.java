package problem26;

import utils.ListNode;

public class Approach1 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int pos =  0 ;
        for(int i = 1 ; i < nums.length ; i++ ) {
            if(nums[pos] != nums[i]){
                ++pos;
                nums[pos] = nums[i];
            }
        }
        return pos+1;
    }
}


