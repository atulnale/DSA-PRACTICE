package problem104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        assertEquals(4,result);
    }
}