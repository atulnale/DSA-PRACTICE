package problem45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int result = approach1.jump(new int[]{2, 3, 1, 1, 4});
        assertEquals(2, result);
    }
}