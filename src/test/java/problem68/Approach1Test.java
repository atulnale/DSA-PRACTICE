package problem68;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        List<String> result = Approach1.printNtimes(4);
        System.out.println(result);
    }
    @Test
    void basic2() {
        List<String> result = Approach1.printNtimes(3);
        System.out.println(result);
    }
}