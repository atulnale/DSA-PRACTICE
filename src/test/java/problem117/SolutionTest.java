package problem117;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();
    @Test
    void basic1() {
        List<Integer> duplicates = main.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(duplicates);
    }
    @Test
    void basic2() {
        List<Integer> duplicates = main.findDuplicates(new int[]{1,1,2});
        System.out.println(duplicates);
    }
}