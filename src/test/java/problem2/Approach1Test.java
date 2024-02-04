package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7,new ListNode(0, new ListNode(8)));
        ListNode result = approach1.addTwoNumbers(l1, l2);
        assertTrue(compareTwoList(expected,result));
    }
    @Test
    public void test2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expected = new ListNode(0);
        ListNode result = approach1.addTwoNumbers(l1, l2);
        assertTrue(compareTwoList(expected,result));
    }

    public boolean compareTwoList(ListNode l1, ListNode l2){
        while(l1 != null || l2 != null){
            if(l1 == null) return false;
            if(l2 == null) return false;
            if(l1.val == l2.val){
                l1 = l1.next;
                l2 = l2.next;
            } else {
                return false;
            }
        }
        return true;
    }

}
