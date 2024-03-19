package problem89;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        List<Integer> result = Approach1.sortedArray(new int[]{1, 2, 3, 4, 6}, new int[]{2, 3, 5});
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<Integer> result = Approach1.sortedArray(new int[]{1, 2, 3,3}, new int[]{2, 2,4});
        System.out.println(result);
    }
}