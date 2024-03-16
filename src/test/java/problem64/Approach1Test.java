package problem64;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.uniquePaths(3, 7);
        assertEquals(28,result);

    }

    @Test
    void basic2() {
        int result = obj.uniquePaths(3, 2);
        assertEquals(3,result);

    }

    @Test
    void basic3() {
        int result = obj.uniquePaths(1, 1);
        assertEquals(1,result);

    }
}