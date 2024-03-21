package problem97;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        Solution main = new Solution();
        int result = main.majorityElement(new int[]{3, 2, 3});
        assertEquals(3,result);
    }
    @Test
    void basic2() {
        Solution main = new Solution();
        int result = main.majorityElement(new int[]{2,2,1,1,1,2,2});
        assertEquals(2,result);
    }
}