package problem13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.romanToInt("III");
        assertEquals(3,result);
    }
    @Test
    void basic2() {
        int result = obj.romanToInt("LVIII");
        assertEquals(58,result);
    }
    @Test
    void basic3() {
        int result = obj.romanToInt("MCMXCIV");
        assertEquals(1994,result);
    }
}