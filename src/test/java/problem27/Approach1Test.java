package problem27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int result = approach1.removeElement(new int[]{3, 2, 2, 3}, 3);
        assertEquals(2,result);
    }
    @Test
    void basic2() {
        int result = approach1.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        assertEquals(5,result);
    }
}