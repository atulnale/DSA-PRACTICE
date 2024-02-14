package problem23;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        ListNode[] listNodes = new ListNode[]{
                new ListNode(1,new ListNode(4, new ListNode(5))),
                new ListNode(1,new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))};
        ListNode listNode = approach1.mergeKLists(listNodes);
        while(listNode != null) {
            System.out.printf(listNode.val + "\t");
            listNode = listNode.next;
        }
    }
    @Test
    void basic2() {
        ListNode[] listNodes = new ListNode[0];
        ListNode listNode = approach1.mergeKLists(listNodes);
        while(listNode != null) {
            System.out.printf(listNode.val + "\t");
            listNode = listNode.next;
        }
    }
}