package problem103;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        List<Integer> result = Solution.superiorElements(new int[]{1, 2, 3, 2});
        printList(result);
    }

    private void printList(List<Integer> result) {
        for (Integer ele : result) {
            System.out.printf(ele + "\t");
        }
    }
}