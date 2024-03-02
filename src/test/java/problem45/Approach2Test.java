package problem45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach2Test {
    Approach2 obj = new Approach2();

    @Test
    void basic1() {
        int result = obj.jump(new int[]{2, 3, 1, 1, 4});
        assertEquals(2,result);
    }

    @Test
    void basic2() {
        int result = obj.jump(new int[]{2, 3, 0, 1, 4});
        assertEquals(2,result);
    }
}