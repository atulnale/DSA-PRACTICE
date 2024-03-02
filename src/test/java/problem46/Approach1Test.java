package problem46;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        List<List<Integer>> result = obj.permute(new int[]{1, 2, 3});
        System.out.println(result);
    }
}