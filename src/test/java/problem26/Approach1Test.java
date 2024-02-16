package problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int result = approach1.removeDuplicates(new int[]{1, 1, 2});
        assertEquals(2,result);
    }
    @Test
    void basic2() {
        int result = approach1.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        assertEquals(5,result);
    }
}