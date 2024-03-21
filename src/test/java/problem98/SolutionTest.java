package problem98;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6,result);
    }
    @Test
    void basic2() {
        int result = main.maxSubArray(new int[]{5,4,-1,7,8});
        assertEquals(23,result);
    }
}