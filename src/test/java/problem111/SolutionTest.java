package problem111;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        int result = Solution.lowerBound(new int[]{1, 2, 2, 3}, 4, 2);
        assertEquals(1,result);
    }
    @Test
    void basic2() {
        int result = Solution.lowerBound(new int[]{1, 2,2,3,3,5}, 6, 0);
        assertEquals(0,result);
    }
}