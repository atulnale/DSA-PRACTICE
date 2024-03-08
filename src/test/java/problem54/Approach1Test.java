package problem54;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {

    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        List<Integer> result = obj.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(result);
    }

    @Test
    void basic2() {
        List<Integer> result = obj.spiralOrder(new int[][]{{1, 2, 3,4},{5,6,7,8},{9,10,11,12}});
        System.out.println(result);
    }
}