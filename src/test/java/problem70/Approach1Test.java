package problem70;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {

    @Test
    void basic1() {
        List<Long> result = Approach1.factorialNumbers(7);
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<Long> result = Approach1.factorialNumbers(2);
        System.out.println(result);
    }
}