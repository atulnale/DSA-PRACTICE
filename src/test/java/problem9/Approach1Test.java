package problem9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void name() {
        boolean result = approach1.isPalindrome(-121);
        assertFalse(result);
    }

    @Test
    void positiveNumber() {
        boolean result = approach1.isPalindrome(121);
        assertTrue(result);
    }
    @Test
    void notPal() {
        boolean result = approach1.isPalindrome(10);
        assertFalse(result);
    }
}