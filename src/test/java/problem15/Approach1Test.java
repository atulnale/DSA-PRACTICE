package problem15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void Basic() {
        List<List<Integer>> lists = approach1.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(lists);
    }
    @Test
    void Basic2() {
        List<List<Integer>> lists = approach1.threeSum(new int[]{0,1,1});
        System.out.println(lists);
    }
    @Test
    void Basic3() {
        List<List<Integer>> lists = approach1.threeSum(new int[]{0,0,0});
        System.out.println(lists);
    }
}