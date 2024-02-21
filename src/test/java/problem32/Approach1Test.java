package problem32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.longestValidParentheses("(()");
        assertEquals(2,result);
    }
    @Test
    void basic2() {
        int result = obj.longestValidParentheses(")()())");
        assertEquals(4,result);
    }
    @Test
    void basic3() {
        int result = obj.longestValidParentheses("");
        assertEquals(0,result);
    }
    @Test
    void basic4() {
        int result = obj.longestValidParentheses("()(())");
        assertEquals(6,result);
    }
    @Test
    void basic5() {
        int result = obj.longestValidParentheses("()(()");
        assertEquals(2,result);
    }
    @Test
    void basic56() {
        int result = obj.longestValidParentheses(")()())()()(");
        assertEquals(4,result);
    }
}