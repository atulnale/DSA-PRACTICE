package problem83;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        char[] arr = {'A','A','A','B','B','B'};
        int result = approach1.leastInterval(arr, 2);
        assertEquals(8,result);
    }
    @Test
    void basic2() {
        char[] arr = {'A','C','A','B','D','B'};
        int result = approach1.leastInterval(arr, 1);
        assertEquals(6,result);
    }
}