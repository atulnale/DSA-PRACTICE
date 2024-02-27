package problem42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach2 obj = new Approach2();

    @Test
    void basic1() {
        int result = obj.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assertEquals(6,result);
    }
}