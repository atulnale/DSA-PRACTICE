package problem18;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        List<List<Integer>> result = obj.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<List<Integer>> result = obj.fourSum(new int[]{2,2,2,2,2}, 8);
        System.out.println(result);
    }
    @Test
    void basic3() {
        List<List<Integer>> result = obj.fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0);
        System.out.println(result);
    }

    @Test
    void basic4() {
        List<List<Integer>> result = obj.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
        System.out.println(result);
    }

    @Test
    void basic6() {
        List<List<Integer>> result = obj.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        System.out.println(result);
    }

    @Test
    void basic7() {
        List<List<Integer>> result = obj.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11);
        System.out.println(result);
    }
    @Test
    void basic8() {
        List<List<Integer>> result = obj.fourSum(new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000}, 294967296);
        System.out.println(result);
    }

}