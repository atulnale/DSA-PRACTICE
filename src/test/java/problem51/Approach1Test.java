package problem51;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        List<List<String>> lists = approach1.solveNQueens(4);
        System.out.println(lists);
    }
}