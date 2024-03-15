package problem61;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();
    public void printList(final ListNode head){
        ListNode curr = head;
        while(curr != null) {
            System.out.printf(curr.val + "\t");
            curr = curr.next;
        }
    }

    @Test
    void basic1() {
        ListNode head = obj.rotateRight(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5))))),3);
        printList(head);
    }
}