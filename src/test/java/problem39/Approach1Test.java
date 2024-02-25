package problem39;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        List<List<Integer>> result = approach1.combinationSum(new int[]{2,3,6,7}, 7);
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<List<Integer>> result = approach1.combinationSum(new int[]{2}, 1);
        System.out.println(result);
    }
    @Test
    void basic3() {
        List<List<Integer>> result = approach1.combinationSum(new int[]{2,3,5}, 8);
        System.out.println(result);
    }
}