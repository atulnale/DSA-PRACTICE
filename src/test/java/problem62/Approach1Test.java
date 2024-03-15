package problem62;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int result = Approach1.countDigits(336);
        assertEquals(3,result);
    }

    @Test
    void basic2() {
        int result = Approach1.countDigits(35);
        assertEquals(1,result);
    }

    @Test
    void basic3() {
        int result = Approach1.countDigits(373);
        assertEquals(0,result);
    }
}