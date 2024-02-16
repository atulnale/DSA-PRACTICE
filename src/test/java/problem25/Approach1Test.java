package problem25;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode result = obj.reverseKGroup(head, 3);
        printList(result);

    }
    private static void printList(ListNode reverse) {
        while(reverse != null){
            System.out.printf(reverse.val + "\t");
            reverse = reverse.next;
        }
    }
}