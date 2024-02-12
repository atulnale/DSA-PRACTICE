package problem19;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode result = approach1.removeNthFromEnd(head, 2);
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val+"\t");
            curr = curr.next;
        }
    }
    @Test
    void basic2() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode result = approach1.removeNthFromEnd(head, 1);
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val+"\t");
            curr = curr.next;
        }
    }
    @Test
    void basic3() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode result = approach1.removeNthFromEnd(head, 5);
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val+"\t");
            curr = curr.next;
        }
    }
    @Test
    void basic4() {
        ListNode head = new ListNode(1);
        ListNode result = approach1.removeNthFromEnd(head, 1);
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val+"\t");
            curr = curr.next;
        }
    }
}