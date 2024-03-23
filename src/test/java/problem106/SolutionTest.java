package problem106;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import java.util.List;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        ListNode head = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4))));
        main.reorderList(head);
        printList(head);
    }


    @Test
    void basic2() {
        ListNode head = ListNode.createList(List.of(1,2,3,4,5));
        main.reorderList(head);
        printList(head);
    }

    private void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.printf(curr.val + "\t");
            curr = curr.next;
        }
    }
}