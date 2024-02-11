package problem17;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        List<String> result = obj.letterCombinations("23");
        System.out.println(result);

    }
    @Test
    void basic2() {
        List<String> result = obj.letterCombinations("");
        System.out.println(result);
    }
    @Test
    void basic3() {
        List<String> result = obj.letterCombinations("2");
        System.out.println(result);
    }
}