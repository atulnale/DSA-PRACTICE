package problem85;

public class Approach1 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            } j++;
        }
        return i+1;
    }
}