package problem25;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListIterativeTest {
    ReverseListIterative obj = new ReverseListIterative();

    @Test
    void basic1() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4))));
        ListNode end = endNode(head);
        obj.reverse(head, end);
        printList(end);
    }

    private static void printList(ListNode reverse) {
        while(reverse != null){
            System.out.printf(reverse.val + "\t");
            reverse = reverse.next;
        }
    }
    private static ListNode endNode(ListNode head){
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        return curr;
    }

}