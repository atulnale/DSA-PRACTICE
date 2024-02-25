package problem40;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        List<List<Integer>> result = approach1.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(result);
    }

    @Test
    void basic2() {
        List<List<Integer>> result = approach1.combinationSum2(new int[]{10}, 10);
        System.out.println(result);
    }
}