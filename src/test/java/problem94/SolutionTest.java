package problem94;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic() {
        int result = Solution.longestSubarrayWithSumK(new int[]{1, 2, 3, 1, 1, 1, 1}, 3);
        assertEquals(3,result);
    }
    @Test
    void basic2() {
        int result = Solution.longestSubarrayWithSumK(new int[]{1,2,1,3}, 2);
        assertEquals(1,result);
    }
}