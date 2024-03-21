package problem96;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        main.sortColors(nums);
        printArray(nums);

    }
    @Test
    void basic2() {
        int[] nums = {2, 0, 1};
        main.sortColors(nums);
        printArray(nums);

    }

    private void printArray(int[] nums) {
        for(int ele : nums){
            System.out.printf(ele + "\t");
        }
    }

}