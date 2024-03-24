package problem114;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2,result);
    }
    @Test
    void basic2() {
        int result = main.findDuplicate(new int[]{3,1,3,4,2});
        assertEquals(3,result);
    }
}