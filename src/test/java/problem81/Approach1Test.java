package problem81;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int[][] arr = {{10,16},{2,8},{1,6}, {7,12}};
        Approach1 approach1 = new Approach1();
        int result = approach1.findMinArrowShots(arr);
        assertEquals(2, result);
    }
    @Test
    void basic2() {
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
        Approach1 approach1 = new Approach1();
        int result = approach1.findMinArrowShots(arr);
        assertEquals(4, result);
    }
    @Test
    void basic3() {
        int[][] arr = {{1,2},{2,3},{3,4},{4,5}};
        Approach1 approach1 = new Approach1();
        int result = approach1.findMinArrowShots(arr);
        assertEquals(2, result);
    }
}