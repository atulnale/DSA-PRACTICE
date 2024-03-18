package problem80;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {

    @Test
    void basic1() {
        int result = Approach1.largestElement(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(5,result);
    }
}