package problem66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int result = Approach1.sumOfAllDivisors(5);
        assertEquals(21,result);
    }

    @Test
    void basic2() {
        int result = Approach1.sumOfAllDivisors(3);
        assertEquals(8,result);
    }
}