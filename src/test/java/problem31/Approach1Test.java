package problem31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    public void printArray(int[] nums){
        for(int i = 0 ; i < nums.length; i++){
            System.out.printf(nums[i]+"\t");
        }
    }
    @Test
    void basic1() {
        int[] nums = new int[] {1,2,3};
        approach1.nextPermutation(nums);
        printArray(nums);
    }

    @Test
    void basic2() {
        int[] nums = new int[] {3,2,1};
        approach1.nextPermutation(nums);
        printArray(nums);
    }

    @Test
    void basic3() {
        int[] nums = new int[] {1,1,5};
        approach1.nextPermutation(nums);
        printArray(nums);
    }
    @Test
    void basic4() {
        int[] nums = new int[] {1,3,2};
        approach1.nextPermutation(nums);
        printArray(nums);
    }
}