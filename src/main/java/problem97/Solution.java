package problem97;

public class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for(int ele: nums) {
            if(count == 0){
                count++;
                num = ele;
            } else {
                if(ele == num) count++;
                else {
                    count--;
                }
            }
        }
        return num;
    }

}