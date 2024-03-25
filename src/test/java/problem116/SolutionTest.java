package problem116;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        int result = Solution.count(new int[]{1, 1, 1, 2, 2, 3, 3}, 7, 3);
        assertEquals(2,result);
    }

    @Test
    void basic2() {
        int result = Solution.count(new int[]{1, 2,4,4,5}, 5, 6);
        assertEquals(0,result);
    }
    @Test
    void basic3() {
        int result = Solution.count(new int[]{1, 2,4,4,5}, 5, 0);
        assertEquals(0,result);
    }
}