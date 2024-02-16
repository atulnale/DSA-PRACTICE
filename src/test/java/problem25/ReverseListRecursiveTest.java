package problem25;

import org.junit.jupiter.api.Test;
import utils.ListNode;

public class ReverseListRecursiveTest {
    ReverseListRecursive obj = new ReverseListRecursive();

    @Test
    void basic1() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4))));
        ListNode reverse = obj.reverse(head);
        printList(reverse);
    }

    private static void printList(ListNode reverse) {
        while(reverse != null){
            System.out.printf(reverse.val + "\t");
            reverse = reverse.next;
        }
    }
}