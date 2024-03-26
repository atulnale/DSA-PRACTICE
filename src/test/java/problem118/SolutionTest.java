package problem118;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        int result = Solution.getLongestZeroSumSubarrayLength(new int[]{1, -1, 0, 0, 1});
        assertEquals(4,result);
    }

    @Test
    void basic2() {
        int result = Solution.getLongestZeroSumSubarrayLength(new int[]{1, 1});
        assertEquals(0,result);
    }
}