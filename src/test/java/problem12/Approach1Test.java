package problem12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        String result = obj.intToRoman(3);
        assertEquals("III",result);
    }
    @Test
    void basic2() {
        String result = obj.intToRoman(58);
        assertEquals("LVIII",result);
    }
    @Test
    void basic3() {
        String result = obj.intToRoman(1994);
        assertEquals("MCMXCIV",result);
    }

}