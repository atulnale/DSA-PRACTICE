package problem41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int res = approach1.firstMissingPositive(new int[]{1, 2, 0});
        assertEquals(3,res);
    }

    @Test
    void basic2() {
        int res = approach1.firstMissingPositive(new int[]{3,4,-1,1});
        assertEquals(2,res);
    }

    @Test
    void basic3() {
        int res = approach1.firstMissingPositive(new int[]{7,8,9,11,12});
        assertEquals(1,res);
    }
    @Test
    void basic4() {
        int res = approach1.firstMissingPositive(new int[]{1});
        assertEquals(2,res);
    }
    @Test
    void basic5() {
        int res = approach1.firstMissingPositive(new int[]{1,1});
        assertEquals(2,res);
    }
}