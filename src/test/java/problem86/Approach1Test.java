package problem86;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int[] result = {1, 2, 3, 4, 5, 6};
        approach1.rotate(result, 2);
        printArray(result);

    }

    @Test
    void basic2() {
        int[] result = {1, 2, 3, 4, 5, 6,7};
        approach1.rotate(result, 3);
        printArray(result);

    }

    private void printArray(int[] result) {
        for(int ele : result) {
            System.out.printf(ele + "\t");
        }
    }
}