package problem123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution main = new Solution();

    @Test
    void basic1() {
        long result = main.countSubarrays(new int[]{1, 3, 2, 3, 3}, 2);
        assertEquals(6, result);
    }
    @Test
    void basic2() {
        long result = main.countSubarrays(new int[]{1,4,2,1}, 3);
        assertEquals(0, result);
    }
}