package problem108;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        List<List<Integer>> result = main.generate(5);
        System.out.println(result);
    }
}