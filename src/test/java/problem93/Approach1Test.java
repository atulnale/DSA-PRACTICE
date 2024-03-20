package problem93;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        ListNode listNode = approach1.mergeInBetween(new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5)))))), 3, 4,
                new ListNode(1000000, new ListNode(1000001, new ListNode(1000002))));
        printListNode(listNode);
    }

    private void printListNode(ListNode listNode) {
        while(listNode != null) {
            System.out.printf(listNode.val + "\t");
            listNode = listNode.next;
        }
    }
}