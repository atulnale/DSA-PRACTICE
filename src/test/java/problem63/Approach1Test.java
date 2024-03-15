package problem63;

import org.junit.jupiter.api.Test;
import problem63.Approach1;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int result = Approach1.calcGCD(4, 6);
        assertEquals(2, result);
    }

    @Test
    void basic2() {
        int result = Approach1.calcGCD(10, 3);
        assertEquals(1, result);
    }

    @Test
    void basic3() {
        int result = Approach1.calcGCD(10, 10);
        assertEquals(10, result);
    }
}