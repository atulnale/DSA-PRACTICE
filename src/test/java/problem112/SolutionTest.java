package problem112;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        int result = Solution.upperBound(new int[]{2, 4, 6, 7}, 5, 4);
        assertEquals(2,result);
    }
    @Test
    void basic2() {
        int result = Solution.upperBound(new int[]{1,4,7,8,10}, 7,5);
        assertEquals(3,result);
    }
    @Test
    void basic3() {
        int result = Solution.upperBound(new int[]{1,2,5,6,10}, 10,5);
        assertEquals(5,result);
    }
}