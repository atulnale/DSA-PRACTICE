package problem90;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int result = approach1.missingNumber(new int[]{3, 0, 1});
        assertEquals(2, result);
    }
    @Test
    void basic2() {
        int result = approach1.missingNumber(new int[]{0,1});
        assertEquals(2, result);
    }
    @Test
    void basic3() {
        int result = approach1.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        assertEquals(8, result);
    }
    @Test
    void basic4() {
        int result = approach1.missingNumber(new int[]{2,0});
        assertEquals(1, result);
    }
}