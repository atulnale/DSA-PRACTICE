package problem109;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        List<Integer> list = main.majorityElement(new int[]{3, 2, 3});
        System.out.println(list);
    }
    @Test
    void basic2() {
        List<Integer> list = main.majorityElement(new int[]{1,2});
        System.out.println(list);
    }
}