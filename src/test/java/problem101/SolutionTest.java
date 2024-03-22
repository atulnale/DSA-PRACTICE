package problem101;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int[] result = main.rearrangeArray(new int[]{3, 1, -2, -5, 2, -4});
        printArray(result);

    }

    private void printArray(int[] result) {
        for (int ele : result) {
            System.out.printf(ele + "\t");
        }
    }
}