package problem55;

import org.junit.jupiter.api.Test;
import problem55.Approach1;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        boolean result = obj.canJump(new int[]{2, 3, 1, 1, 4});
        assertTrue(result);
    }
    @Test
    void basic2() {
        boolean result = obj.canJump(new int[]{3,2,1,0,4});
        assertFalse(result);
    }
}