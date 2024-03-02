package problem47;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        List<List<Integer>> result = obj.permuteUnique(new int[]{1, 2, 3});
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<List<Integer>> result = obj.permuteUnique(new int[]{1, 1, 2});
        System.out.println(result);
    }
}