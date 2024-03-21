package problem95;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution main = new Solution();

    @Test
    void basic1() {
        ListNode head = main.reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));
        printList(head);
    }

    private void printList(ListNode head) {
        while(head != null) {
            System.out.printf(head.val + "\t");
            head = head.next;
        }
    }
}