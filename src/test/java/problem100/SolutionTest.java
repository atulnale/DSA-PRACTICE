package problem100;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic() {
        boolean result = main.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
        assertTrue(result);
    }
}