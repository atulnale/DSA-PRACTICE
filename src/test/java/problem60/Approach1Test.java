package problem60;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        String result = obj.getPermutation(3, 3);
        assertEquals("213", result);
    }
}