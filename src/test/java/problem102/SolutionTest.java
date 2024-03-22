package problem102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int[] nums = {1, 2, 3};
        main.nextPermutation(nums);
        printArray(nums);
    }

    @Test
    void basic2() {
        int[] nums = {3,2,1};
        main.nextPermutation(nums);
        printArray(nums);
    }

    private void printArray(int[] nums) {
        for (int num : nums) {
            System.out.printf(num+ "\t");
        }
    }
}